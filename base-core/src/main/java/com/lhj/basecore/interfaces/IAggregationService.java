package com.lhj.basecore.interfaces;

import java.util.Map;

/**
 * <p>
 * es 服务类
 * </p>
 *
 * @author 李洪健
 * @since 2021-03-15
 */
public interface IAggregationService {

    long distinctCount(String index, String field);

    double minAgg(String index, String field);

    double maxAgg(String index, String field);

    double avgAgg(String index, String field);

    Map<Object, Long> termsCountAgg(String index, String field);
}
