/*
 * Copyright (C) 2015-2017 The OwnROM Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.own.settings.owncenter.tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;

import com.android.internal.logging.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class Maintainers extends SettingsPreferenceFragment {
	
	public static final String TAG = "maintainers";

	// Google
	private String KEY_ANGLER_MAINTAINER_PLUS_LINK = "angler_maintainer_plus_link";
	
	// LG
	private String KEY_D852_MAINTAINER_PLUS_LINK = "d852_maintainer_plus_link";
	
	// Lenovo
	private String KEY_A7010a48_MAINTAINER_PLUS_LINK = "A7010a48_maintainer_plus_link";

	// Motorola
	private String KEY_HARPIA_MAINTAINER_PLUS_LINK = "harpia_maintainer_plus_link";
	private String KEY_POTTER_MAINTAINER_PLUS_LINK = "potter_maintainer_plus_link";
	
	// OnePlus
	private String KEY_ONEPLUS2_MAINTAINER_PLUS_LINK = "oneplus2_maintainer_plus_link";
	
	
	// Google
	private Preference mAnglerPlusUrl;
	
	// LG
	private Preference mD852PlusUrl;
	
	// Lenovo
	private Preference mA7010a48PlusUrl;
	
	// Motorola
	private Preference mHarpiaPlusUrl;
	private Preference mPotterPlusUrl;
	
	// OnePlus
	private Preference mOneplus2PlusUrl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.ownrom_maintainers);

		// Google
        mAnglerPlusUrl = findPreference(KEY_ANGLER_MAINTAINER_PLUS_LINK);
        
        // LG
        mD852PlusUrl = findPreference(KEY_D852_MAINTAINER_PLUS_LINK);
        
        // Lenovo
        mA7010a48PlusUrl = findPreference(KEY_A7010a48_MAINTAINER_PLUS_LINK);
        
        // Motorola
        mHarpiaPlusUrl = findPreference(KEY_HARPIA_MAINTAINER_PLUS_LINK);
        mPotterPlusUrl = findPreference(KEY_POTTER_MAINTAINER_PLUS_LINK);
        
        // OnePlus
        mOneplus2PlusUrl = findPreference(KEY_ONEPLUS2_MAINTAINER_PLUS_LINK);
        
    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {

		// Google
        if (preference == mAnglerPlusUrl) {
            launchUrl("https://plus.google.com/+MarkVisser10021991");
            
		// LG
		} else if (preference == mD852PlusUrl) {
			launchUrl("https://plus.google.com/+VictorLinfield");
			
		// Lenovo
		} else if (preference == mA7010a48PlusUrl) {
			launchUrl("https://plus.google.com/+MohanCm100");
		
		// Motorola
		} else if (preference == mHarpiaPlusUrl) {
			launchUrl("https://plus.google.com/u/0/+subhrajyotisen12");
		} else if (preference == mPotterPlusUrl) {
			launchUrl("https://plus.google.com/u/1/110774809129522678759");
			
		// OnePlus
		} else if (preference == mOneplus2PlusUrl) {
			launchUrl("https://plus.google.com/+MuhammadHamzaMZO");
				
        }
        return super.onPreferenceTreeClick(preference);
    }


    private void launchUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        getActivity().startActivity(intent);
    }

               
    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.OWN;
     }
}
