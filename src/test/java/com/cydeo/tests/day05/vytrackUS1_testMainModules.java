package com.cydeo.tests.day05;

import com.cydeo.utilities.Vytrack_Utilities;
import org.testng.annotations.Test;

public class vytrackUS1_testMainModules {

    /*
    User Story 1:  As a user, I should be accessing all the main modules of the app.

    Acceptance Criteria #1: Store and sales managers should view 8 module names.
    Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

    Acceptance Criteria #2: Drivers should view 4 module names
    Expected module names: Fleet, Customers, Activities, System

    Test Case #1
    Description: Managers access to main modules
    Environment: https://qa1.vytrack.com/user/login
    Steps: 1. login as a sales manager or store manager
           2. Verify the users see 8 modules: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

    Test Case #2
    Description: Drivers access to main modules
    Environment:  https://qa1.vytrack.com/user/login
    Steps:: 1. login as a driver
            2. Verify the users see 4 modules: Fleet, Customers, Activities, System
     */

    @Test
    public void verify_modules_as_salesManager() {

        Vytrack_Utilities.loginAsSalesManager();
    }
}
