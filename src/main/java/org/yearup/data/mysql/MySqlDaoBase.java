package org.yearup.data.mysql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

package org.yearup.data.mysql;

import org.springframework.beans.factory.annotation.Autowired; // Importeren
import org.springframework.stereotype.Component; // Zorg ervoor dat de subklassen dit hebben

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class MySqlDaoBase
{
    private DataSource dataSource;

    // Use @Autowired on the constructor to get the auto-geconfigureerde DataSource te ontvangen
    @Autowired
    public MySqlDaoBase(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    protected Connection getConnection() throws SQLException
    {
        return dataSource.getConnection();
    }
}