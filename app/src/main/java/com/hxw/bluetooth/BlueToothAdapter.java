package com.hxw.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by hxw on 2017/4/27.
 */

public class BlueToothAdapter extends BaseQuickAdapter<BluetoothGattService, BaseViewHolder> {
    public BlueToothAdapter(@Nullable List<BluetoothGattService> data) {
        super(R.layout.item_text, data);
    }

    /**
     * Implement this method and use the helper to adapt the view to the given item.
     *
     * @param holder A fully initialized helper.
     * @param item   The item that needs to be displayed.
     */
    @Override
    protected void convert(BaseViewHolder holder, BluetoothGattService item) {
        holder.setText(R.id.tv_name, item.getUuid().toString());
    }
}
