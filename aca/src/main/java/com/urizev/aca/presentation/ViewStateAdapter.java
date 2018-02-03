package com.urizev.aca.presentation;

import com.google.common.collect.ImmutableList;
import com.hannesdorfmann.adapterdelegates3.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates3.ListDelegationAdapter;

public class ViewStateAdapter extends ListDelegationAdapter<ImmutableList<? extends ViewState>> {
    public ViewStateAdapter(ImmutableList<AdapterDelegate<ImmutableList<? extends ViewState>>> delegates) {
        super();
        for (AdapterDelegate<ImmutableList<? extends ViewState>> delegate : delegates){
            delegatesManager.addDelegate(delegate);
        }
    }
}
