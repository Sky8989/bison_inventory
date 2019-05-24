package com.leaderment.pojo.vo;


/**
 * @ClassName SalePlanItemListByOperationsVO  运营列表展示视图
 * @Description TODO
 * @Author Lee
 * @Date 19-4-26 下午4:03
 * @Version 1.0
 **/

public class AmzInventoryVO {

    private int productId;

    private int userId;

    private String productModelNumber;


    //亚马逊

    /**
     *  可售
     */
    private int fulfillableQuantity;

    /**
     *  不可售
     */
    private int unsellableQuantity;


    /**
     *  在途
     */
    private int shippedAndReceivingQuantity;



    /**
     *  亚马逊总库存 = 可售 + 在途
     * @return
     */
    private int amzInventorySum;

    /**
     * 亚马逊总可售天数 = 亚马逊总库存 / 备货日均
     * @return
     */
    private int  amzFulfillableQuantityDay;

    /**
     * 亚马逊安全库存天数
     * @return
     */
    private int amzSafetyDay;


    //亚马逊需补发数量
    /**
     * 补货天数 = 亚马逊安全库存天数 - 亚马逊总可售天数
     * @return
     */
    private int amzReplenishmentDay;


    /**
     * 补货数量 = 补货天数 *备货日均
     * @return
     */
    private int replenishmentQuantity;


}
