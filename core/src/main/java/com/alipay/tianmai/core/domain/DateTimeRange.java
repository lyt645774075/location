package com.alipay.tianmai.core.domain;


import org.joda.time.DateTime;

/**
 * Created by yangtao.lyt on 2015/7/20.
 */
public class DateTimeRange {

    private DateTime start;

    private DateTime end;

    private boolean isContainStart;

    private boolean isContainEnd;


    public DateTimeRange(DateTime start, DateTime end, boolean isContainStart, boolean isContainEnd){
        this.start = start;
        this.end = end;
        this.isContainStart = isContainStart;
        this.isContainEnd = isContainEnd;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }

    public boolean isContainStart() {
        return isContainStart;
    }

    public boolean isContainEnd() {
        return isContainEnd;
    }
}
