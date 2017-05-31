package com.yjs.recyclerview.baseadapter;

import android.view.View;

import com.yjs.recyclerview.bean.ChannelEntity;
import com.yjs.recyclerview.EntityTwo;

/**
 * Created by yangjingsong on 17/2/13.
 */

public interface TypeFactory {
    int type(ChannelEntity channelEntity);
    int type(EntityTwo entityTwo);
}
