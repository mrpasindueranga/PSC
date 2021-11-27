package com.psc.psc_management.Services;

public class EmployeeNotFoundException extends Throwable {
    public EmployeeNotFoundException(String cause) {
        super(cause);
    }
}
