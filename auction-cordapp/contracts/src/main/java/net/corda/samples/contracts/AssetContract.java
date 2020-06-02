package net.corda.samples.contracts;

import net.corda.core.contracts.Command;
import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.CommandWithParties;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;

public class AssetContract implements Contract {
    @Override
    public void verify(@NotNull LedgerTransaction tx) throws IllegalArgumentException {
        // Contract Verification code goes here. Left blank for simplicity
        if(tx.getCommands().size() == 0){
            throw new IllegalArgumentException("One command Expected");
        }
        Command command = tx.getCommand(0);
        if(command.getValue() instanceof Commands.CreateAsset) {
            verifyCreateAsset(tx);
        }else if(command.getValue() instanceof Commands.TransferAsset){
            verifyTransferAsset(tx);
        }
        else{
            //throw new IllegalArgumentException("命令不存在");
        }
    }
    private void verifyCreateAsset(LedgerTransaction tx){
        //如果，物品的token已经存在，抛出异常
    }

    private void verifyTransferAsset(LedgerTransaction tx){
        //TODO: 设定业务逻辑

    }

    public interface Commands extends CommandData {
        class CreateAsset implements Commands {}
        class TransferAsset implements Commands {}
    }
}
