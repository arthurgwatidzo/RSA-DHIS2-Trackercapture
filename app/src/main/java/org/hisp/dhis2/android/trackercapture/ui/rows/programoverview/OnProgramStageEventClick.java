package org.hisp.dhis2.android.trackercapture.ui.rows.programoverview;

import android.widget.ImageButton;

import org.hisp.dhis2.android.sdk.persistence.models.Event;

/**
 * Created by erling on 5/28/15.
 */
public class OnProgramStageEventClick
{
    private final Event event;
    private final ImageButton hasFailedButton;
    private final boolean hasPressedFailedButton;



    private final String errorMessage;

    public OnProgramStageEventClick(Event event, ImageButton hasFailedButton, boolean hasPressedFailedButton, String errorMessage)
    {
        this.event = event;
        this.hasFailedButton = hasFailedButton;
        this.hasPressedFailedButton = hasPressedFailedButton;
        this.errorMessage = errorMessage;
    }
    public boolean isHasPressedFailedButton() {
        return hasPressedFailedButton;
    }

    public ImageButton getHasFailedButton() {
        return hasFailedButton;
    }

    public Event getEvent() {
        return event;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
}
