package com.rest.dubbox.service;


import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.rest.common.vo.SysResult;

@Path("house")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface DubboxHouseInfoService {

	/**
	 * 根据出租时间和地区id查询有效房源信息
	 * @param outTime 出租时间
	 * @param areaId 读取id
	 * @return sysResult
	 */
	@Path("list")
	@GET
	public SysResult queryHouseListByTimeArea(@QueryParam("outTime")Date outTime,
											@QueryParam("areaId")Integer areaId);
	
}
