package com.urizev.aca.presentation;

import com.urizev.aca.utils.RxUtils;

public abstract class DirectPresenterFragment<VS extends ViewState, P extends Presenter<VS>> extends PresenterFragment<VS,VS,P> {
    @Override
    protected VS prepareViewState(VS vs) {
        RxUtils.assertComputationThread();
        return vs;
    }
}
