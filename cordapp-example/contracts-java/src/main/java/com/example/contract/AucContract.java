package com.example.contract;

import com.example.state.AucState;
import net.corda.core.contracts.Command;
import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.Party;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

public class AucContract implements Contract {
    public static String ID = "com.example.contract.AucContract";
    @Override
    public void verify(@NotNull LedgerTransaction tx) throws IllegalArgumentException {
        if (tx.getCommands().size() != 1) {
            throw new IllegalArgumentException("Transaction must have one command");
        }
        Command command = tx.getCommand(0);
        CommandData commandType = command.getValue();
        List<PublicKey> requiredKey = command.getSigners();
        //发行
        if (commandType instanceof AucContract.AucCommands.Issue) {
            //"Shape" constraint - No. input states,no. output states,command
            if (tx.getInputStates().size() != 0) {
                throw new IllegalArgumentException("Register transaction must have no inputs");
            }
            if (tx.getOutputs().size() != 1) {
                throw new IllegalArgumentException("Register transaction must have one output");
            }
            //content constraint
            ContractState outputState = tx.getOutput(0);
            if (!(outputState instanceof AucState)) {
                throw new IllegalArgumentException("Output must be a AucState");
            }
            AucState aucState = (AucState) outputState;

            // Required Signer constraint
            Party owner = (Party) aucState.getOwner();
            PublicKey ownerKey = owner.getOwningKey();
            if (!requiredKey.contains(ownerKey)) {
                throw new IllegalArgumentException("Owner of the house must sign the registration");
            }
        }
        //转移
        else if (commandType instanceof AucContract.AucCommands.Transfer) {

        }
        //更新
        else if (commandType instanceof AucContract.AucCommands.Update) {

        } else {
            throw new IllegalArgumentException("Unrecognized command");
        }

    }

    public interface AucCommands extends CommandData {
        //发行
        static class Issue implements AucContract.AucCommands {}
        //转移
        static class Transfer implements AucContract.AucCommands {}
        //更新
        static class Update implements AucContract.AucCommands {}
    }
}
