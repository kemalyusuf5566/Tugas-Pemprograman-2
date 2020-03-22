/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import com.app.entity.Mahasiswa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo B40-80
 */
public class MahasiswaTabelModel extends AbstractTableModel{
    private List<Mahasiswa> list;
    
    public MahasiswaTabelModel() {
    }
    
    public MahasiswaTabelModel (List<Mahasiswa> list) {
        
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return list.get(rowIndex).getValue(columnIndex);
    }
    
    private String[] columns = {"NIM","Nama","Jurusan","Alamat","Email","Telepon"};
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }

}
