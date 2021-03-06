package com.izhbg.typz.shop.goods.service;

import com.izhbg.typz.shop.goods.dto.TShGoodsStock;

public interface TShGoodsStockService extends BaseService<TShGoodsStock> {
	/**
	 * 获取商品信息
	 * @param id
	 * @param version
	 * @return
	 * @throws Exception
	 */
	public TShGoodsStock queryByGoodsIdAndVersion(String id,Integer version) throws Exception;
}
