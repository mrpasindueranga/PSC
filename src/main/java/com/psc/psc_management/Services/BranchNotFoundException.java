package com.psc.psc_management.Services;

public class BranchNotFoundException extends Throwable {
    public BranchNotFoundException(String cause) {
        super(cause);
    }
}
