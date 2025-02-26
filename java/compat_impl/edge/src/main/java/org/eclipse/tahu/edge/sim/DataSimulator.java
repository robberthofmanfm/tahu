/*
 * Licensed Materials - Property of Cirrus Link Solutions
 * Copyright (c) 2022 Cirrus Link Solutions LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package org.eclipse.tahu.edge.sim;

import org.eclipse.tahu.message.model.DeviceDescriptor;
import org.eclipse.tahu.message.model.EdgeNodeDescriptor;
import org.eclipse.tahu.message.model.Metric;
import org.eclipse.tahu.message.model.SparkplugBPayload;
import org.eclipse.tahu.message.model.SparkplugBPayloadMap;
import org.eclipse.tahu.message.model.SparkplugDescriptor;

public interface DataSimulator {

	/**
	 * Getting for fetching a NBIRTH {@link SparkplugBPayloadMap}
	 * 
	 * @param sparkplugDescriptor the {@link EdgeNodeDescriptor} to use when fetching the {@link SparkplugBPayloadMap}
	 * 
	 * @return a {@link SparkplugBPayloadMap} representing an NBIRTH payload
	 */
	public SparkplugBPayloadMap getNodeBirthPayload(EdgeNodeDescriptor edgeNodeDescriptor);

	/**
	 * Getting for fetching a DBIRTH {@link SparkplugBPayload}
	 * 
	 * @param deviceDescriptor the {@link DeviceDescriptor} to use when fetching the {@link SparkplugBPayload}
	 * 
	 * @return a {@link SparkplugBPayload} representing an DBIRTH payload
	 */
	public SparkplugBPayload getDeviceBirthPayload(DeviceDescriptor deviceDescriptor);

	/**
	 * Getting for fetching a DDATA {@link SparkplugBPayload}
	 * 
	 * @param deviceDescriptor the {@link DeviceDescriptor} to use when fetching the {@link SparkplugBPayload}
	 * 
	 * @return a {@link SparkplugBPayload} representing an DDATA payload
	 */
	public SparkplugBPayload getDeviceDataPayload(DeviceDescriptor deviceDescriptor);

	/**
	 * 
	 * @param sparkplugDescriptor
	 * @param metricName
	 * @return
	 */
	public boolean hasMetric(SparkplugDescriptor sparkplugDescriptor, String metricName);

	public Metric handleMetricWrite(SparkplugDescriptor sparkplugDescriptor, Metric metric);
}
