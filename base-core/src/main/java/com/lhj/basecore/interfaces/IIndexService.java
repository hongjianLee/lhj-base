package com.lhj.basecore.interfaces;

import org.elasticsearch.action.admin.indices.refresh.RefreshResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexResponse;
import org.elasticsearch.client.indices.ResizeResponse;
import org.elasticsearch.cluster.metadata.MappingMetadata;
import org.elasticsearch.common.settings.Settings;

import java.util.Map;

public interface IIndexService {

    boolean exists(String... indices);

    GetIndexResponse getIndex(String... indices);

    CreateIndexResponse createIndex(String index);

    AcknowledgedResponse putSettings(String index, Settings settings);

    Map<String, MappingMetadata> getMappings(String... indices);

    Map<String, Object> getSingleMappings(String index);

    AcknowledgedResponse putMappings(String index, Map<String, ?> mappingSource);

    AcknowledgedResponse cloneMappings(String sourceIndex, String targetIndex);

    CreateIndexResponse cloneIndexWithoutData(String sourceIndex, String targetIndex);

    ResizeResponse cloneIndex(String sourceIndex, String targetIndex);

    AcknowledgedResponse deleteIndex(String index);

    RefreshResponse refresh(String index);

}
