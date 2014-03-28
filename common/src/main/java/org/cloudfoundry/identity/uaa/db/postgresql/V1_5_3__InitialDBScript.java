/*******************************************************************************
 *     Cloud Foundry 
 *     Copyright (c) [2009-2014] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
package org.cloudfoundry.identity.uaa.db.postgresql;

import java.sql.Connection;

import org.cloudfoundry.identity.uaa.db.DataSourceAccessor;
import org.cloudfoundry.identity.uaa.db.InitialPreDatabaseVersioningSchemaCreator;

public class V1_5_3__InitialDBScript extends InitialPreDatabaseVersioningSchemaCreator {
    public V1_5_3__InitialDBScript() {
        super("postgresql");
    }

    @Override
    public void migrate(Connection connection) throws Exception {
        Connection con = DataSourceAccessor.getDataSource().getConnection();
        try {
            super.migrate(con);
        } finally {
            try { con.close(); } catch (Exception ignore) {}
        }
    }
    
    
}
