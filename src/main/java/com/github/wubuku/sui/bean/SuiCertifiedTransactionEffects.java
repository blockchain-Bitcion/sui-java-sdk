package com.github.wubuku.sui.bean;

public class SuiCertifiedTransactionEffects { //extends LinkedHashMap<String, Object> {
    private String transactionEffectsDigest;
    private TransactionEffects effects;
    private AuthorityQuorumSignInfo authSignInfo;

    public SuiCertifiedTransactionEffects() {
    }

    public SuiCertifiedTransactionEffects(String transactionEffectsDigest, TransactionEffects effects, AuthorityQuorumSignInfo authSignInfo) {
        this.transactionEffectsDigest = transactionEffectsDigest;
        this.effects = effects;
        this.authSignInfo = authSignInfo;
    }

    public String getTransactionEffectsDigest() {
        return transactionEffectsDigest;
    }

    public void setTransactionEffectsDigest(String transactionEffectsDigest) {
        this.transactionEffectsDigest = transactionEffectsDigest;
    }

    public TransactionEffects getEffects() {
        return effects;
    }

    public void setEffects(TransactionEffects effects) {
        this.effects = effects;
    }

    public AuthorityQuorumSignInfo getAuthSignInfo() {
        return authSignInfo;
    }

    public void setAuthSignInfo(AuthorityQuorumSignInfo authSignInfo) {
        this.authSignInfo = authSignInfo;
    }

    @Override
    public String toString() {
        return "SuiCertifiedTransactionEffects{" +
                "transactionEffectsDigest='" + transactionEffectsDigest + '\'' +
                ", effects=" + effects +
                ", authSignInfo=" + authSignInfo +
                '}';
    }
}
