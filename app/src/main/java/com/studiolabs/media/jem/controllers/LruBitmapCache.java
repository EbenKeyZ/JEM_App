package com.studiolabs.media.jem.controllers;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by StudioLabs on 4/13/2017.
 */
class LruBitmapCache extends LruCache<String, Bitmap> implements ImageLoader.ImageCache {
    private static  int getDefaultLtuCacheSize(){
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory()/ 1024);

        return maxMemory >> 3;
    }

    LruBitmapCache(){
        this(getDefaultLtuCacheSize());
    }

    private LruBitmapCache(int sizeInKiloBytes){
        super(sizeInKiloBytes);
    }

    @Override
    protected  int sizeOf(String key, Bitmap value){
        return  value.getRowBytes() * value.getHeight() / 1024;
    }

    @Override
    public Bitmap getBitmap(String url) {
        return get(url);
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {
        put(url, bitmap);
    }
}
