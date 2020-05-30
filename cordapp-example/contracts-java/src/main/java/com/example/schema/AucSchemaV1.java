package com.example.schema;

import net.corda.core.schemas.MappedSchema;
import net.corda.core.schemas.PersistentState;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.UUID;

/**
 * An AucState schema.
 */
public class AucSchemaV1 extends MappedSchema {
    public AucSchemaV1() {
        super(AucSchema.class, 1, Arrays.asList(PersistentAuc.class));
    }

    @Entity
    @Table(name = "Auc_states")
    public static class PersistentAuc extends PersistentState {


        @Column(name = "owner")
        private String owner;
        @Column(name = "aucId")
        private final String aucId;
        @Column(name = "basePrice")
        private final double basePrice;
        @Column(name = "currentPrice")
        private double currentPrice;
        @Column(name = "linear_id")
        private final UUID linearId;


        public PersistentAuc(String owner, String aucId, double basePrice, double currentPrice, UUID linearId) {
            this.owner = owner;
            this.aucId = aucId;
            this.basePrice = basePrice;
            this.currentPrice = currentPrice;
            this.linearId = linearId;
        }

        // Default constructor required by hibernate.
        public PersistentAuc() {
            this.owner = null;
            this.aucId = null;
            this.basePrice = 0;
            this.currentPrice = 0;
            this.linearId = null;
        }

        public String getOwner() {
            return owner;
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

        public UUID getLinearId() {
            return linearId;
        }
    }
}