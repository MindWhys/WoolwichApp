package com.example.android.woolwichapp;

/**
 * {@link Places} represents a place in Woolwich that a person might want to visit.
 * It contains the name of the location and some information.
 */

public class Places {

    /** Name of the location */
    private String mPlaceName;

    /** Info on the location*/
    private String mPlaceInfo;

    /**
     * Create a new Places object.
     *
     * @param placeName is the name of a place in Woolwich
     *
     * @param placeInfo is the details about the place.
     */
    public Places(String placeName, String placeInfo){
        mPlaceName = placeName;
        mPlaceInfo = placeInfo;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     *  Get the info for the place
     */
    public String getPlaceInto() {
        return mPlaceInfo;
    }

    /** @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", miwokSoundResourceId=" + miwokSoundResourceId +
                '}';
    } */
}
