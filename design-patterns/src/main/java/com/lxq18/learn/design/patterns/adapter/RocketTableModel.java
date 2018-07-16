package com.lxq18.learn.design.patterns.adapter;

import javax.swing.table.AbstractTableModel;

public class RocketTableModel extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
