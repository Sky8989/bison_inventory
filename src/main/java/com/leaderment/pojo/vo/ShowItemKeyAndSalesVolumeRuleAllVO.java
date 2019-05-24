package com.leaderment.pojo.vo;


import java.util.List;

/**
 * @author leaderment
 */
public class ShowItemKeyAndSalesVolumeRuleAllVO {

    /**
     * itemKeyList
     */
    private List<ShowItemKeyVO>  showItemKeyVOList;

    /**
     * 规则列表 以及对应的比率list
     */
    private List<ShowSalesVolumeRuleVO> showSalesVolumeRuleVOList;


    public List<ShowItemKeyVO> getShowItemKeyVOList() {
        return showItemKeyVOList;
    }

    public void setShowItemKeyVOList(List<ShowItemKeyVO> showItemKeyVOList) {
        this.showItemKeyVOList = showItemKeyVOList;
    }

    public List<ShowSalesVolumeRuleVO> getShowSalesVolumeRuleVOList() {
        return showSalesVolumeRuleVOList;
    }

    public void setShowSalesVolumeRuleVOList(List<ShowSalesVolumeRuleVO> showSalesVolumeRuleVOList) {
        this.showSalesVolumeRuleVOList = showSalesVolumeRuleVOList;
    }

    @Override
    public String toString() {
        return "ShowItemKeyAndSalesVolumeRuleAllVO{" +
                "showItemKeyVOList=" + showItemKeyVOList +
                ", showSalesVolumeRuleVOList=" + showSalesVolumeRuleVOList +
                '}';
    }
}

