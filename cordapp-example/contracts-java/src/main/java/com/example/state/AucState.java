package com.example.state;

import net.corda.core.contracts.*;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import net.corda.core.schemas.MappedSchema;
import net.corda.core.schemas.PersistentState;
import net.corda.core.schemas.QueryableState;
import org.jetbrains.annotations.NotNull;
import org.omg.CORBA.Any;
//import com.r3.corda.lib.tokens.contracts.types.TokenType;
import com.example.contract.AucContract;
import com.example.schema.AucSchemaV1;

import javax.sound.midi.Patch;
import java.security.PublicKey;
import java.util.*;

import java.util.List;

@BelongsToContract(AucContract.class)
public class AucState implements LinearState, QueryableState {

    private Party owner;

    private Party auction;

    private List<Party> buyers;

    //auction thing
    //private final Amount<TokenType> thing;
    private final String aucId;

    private final double basePrice;

    private double currentPrice;

    UniqueIdentifier linearId;

    public AucState(Party owner, Party auction, List<Party> buyers, String aucId, double basePrice, double currentPrice, UniqueIdentifier linearId) {
        this.owner = owner;
        this.auction = auction;
        this.buyers = buyers;
        this.aucId = aucId;
        this.basePrice = basePrice;
        this.currentPrice = currentPrice;
        this.linearId = linearId;
    }

    public AucState(Party owner, String aucId, double basePrice, double currentPrice, UniqueIdentifier linearId) {
        this.owner = owner;
        this.aucId = aucId;
        this.basePrice = basePrice;
        this.currentPrice = currentPrice;
        this.linearId = linearId;
    }

    public String getAucId() {
        return aucId;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Party getOwner() {
        return this.owner;
    }

    @NotNull
    @Override
    public List<AbstractParty> getParticipants() {
        List<AbstractParty> abstractPartyList = new ArrayList<>();
        abstractPartyList.add(owner);
        abstractPartyList.add(auction);
        abstractPartyList.addAll(buyers);
        return abstractPartyList;
    }


    @NotNull
    @Override
    public PersistentState generateMappedObject(@NotNull MappedSchema schema) {
        if (schema instanceof AucSchemaV1) {
            return new AucSchemaV1.PersistentAuc(
                    this.owner.getName().toString(),
                    this.aucId,
                    this.basePrice,
                    this.currentPrice,
                    this.linearId.getId());
        } else {
            throw new IllegalArgumentException("Unrecognised schema $schema");
        }
    }

    @NotNull
    @Override
    public Iterable<MappedSchema> supportedSchemas() {
        return Arrays.asList(new AucSchemaV1());
    }

    @NotNull
    @Override
    public UniqueIdentifier getLinearId() {
        return linearId;
    }


}
