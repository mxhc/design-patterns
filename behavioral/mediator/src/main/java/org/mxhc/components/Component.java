package org.mxhc.components;

import org.mxhc.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
