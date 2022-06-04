package com.mps.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="demo")
@EnableConfigurationProperties
public class StoreDataFromYmlToBean {
	private Map<String, String> properties=new HashMap<>();
}
