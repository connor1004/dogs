package com.gjwork.dogs.view

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.gjwork.dogs.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}