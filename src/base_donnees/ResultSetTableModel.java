package base_donnees;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;


/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 *@exams numbers: 734, 394, 586
 *@version: 1.0
 */

public class ResultSetTableModel extends AbstractTableModel {
    
    // Attribut:
    
     private ResultSet rs;
     
    // Constructeur avec un prametre :
     
      public ResultSetTableModel(ResultSet rs) {
        this.rs = rs;
        fireTableDataChanged();
    }
    
    
    // Calcul le nombre de colonne d'une table:
      
    public int getColumnCount() {
        
        try {
                if (rs == null) {
                    return 0;
                
               } else {
                    
                    return  rs.getMetaData().getColumnCount();
            }
        } catch (SQLException e) { 
            e.printStackTrace();
            return 0;
        }
        
    }
    
    // Calcul le nombre de lignes d'une table:
    
    public int getRowCount() {
        try {
            
                if (rs == null) {
                    
                     return 0;
                }else {
                    
                    rs.last();
                    return rs.getRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    // Fonction pour recuperer la valeur d'une case precise d'une table:

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > getRowCount()|| columnIndex < 0 || columnIndex > getColumnCount()) {
            return null;
        }
        try {
                if (rs == null) {
                    return null;
                } else {
                    
                    rs.absolute(rowIndex + 1);
                    return rs.getObject(columnIndex + 1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Fonction pour recuperer le nom d'un attribut dans une colonne bien precise:

    @Override
    public String getColumnName(int columnIndex) {
        
        try {
            
                return rs.getMetaData().getColumnName(columnIndex + 1);
                
        } catch (SQLException e) { e.printStackTrace();}
        
        return super.getColumnName(columnIndex);
    }
    
}

    

