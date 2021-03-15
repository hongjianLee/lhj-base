package com.lhj.basecore.interfaces;

import cn.hutool.json.JSONObject;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
/**
 * <p>
 * es 服务类
 * </p>
 *
 * @author 李洪健
 * @since 2021-03-15
 */
import java.util.List;

public interface IDocumentService {

    DocWriteResponse createDoc(String index, String id, Object source);

    DocWriteResponse upsertDoc(String index, String id, Object source);

//    BulkResponse upsertDocByBulk(String index, List<JSONObject> sources);

    GetResponse getDoc(String index, String id);

    DocWriteResponse deleteDoc(String index, String id);

    BulkByScrollResponse deleteByQuery(String index, String queryJson);

    BulkByScrollResponse clearIndex(String index);

    BulkByScrollResponse reindex(String sourceIndex, String destIndex);
}
