package com.dronteam.adm.i_moby.scenarios.album;

import android.graphics.Bitmap;
import android.view.View;

/**
 * Created by adm on 18.04.2017.
 */

public interface AlbumView {
    void setImage(Bitmap loadedImage);
    void setImage(int resId);
}
