package com.lhj.baseservice.module.es.controller;


import com.alibaba.fastjson.JSONObject;
import com.lhj.basecore.interfaces.IDocumentService;
import io.swagger.annotations.*;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("es文档操作")
@RestController
public class DocumentController {

    @Autowired
    private IDocumentService documentService;

    @ApiOperation("创建文档")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "String", name = "index", value = "索引", dataType = "String"),
            @ApiImplicitParam(paramType = "String", name = "id", value = "id", dataType = "String"),
            @ApiImplicitParam(paramType = "String", name = "document", value = "文档", dataType = "String"),
    })
    @GetMapping("createDocument")
    public String createDocument(@RequestParam String index, @RequestParam String id, @RequestParam String document) {
        DocWriteResponse docWriteResponse = documentService.createDoc(index, id, JSONObject.parse(document));
        return docWriteResponse.toString();
    }


    @ApiOperation("获取文档")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "String", name = "index", value = "索引", dataType = "String"),
            @ApiImplicitParam(paramType = "String", name = "id", value = "类型", dataType = "String"),
    })
    @GetMapping("getDocument")
    public String getDocument(@RequestParam String index,  @RequestParam String id) {
        GetResponse getResponse = documentService.getDoc(index, id);
        return getResponse.toString();
    }

    @ApiOperation("修改文档")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "String", name = "index", value = "索引", dataType = "String"),
            @ApiImplicitParam(paramType = "String", name = "id", value = "id", dataType = "String"),
            @ApiImplicitParam(paramType = "String", name = "document", value = "文档", dataType = "String"),
    })
    @GetMapping("updateDocument")
    public String updateDocument(@RequestParam String index, @RequestParam String id, @RequestParam String document) {
        DocWriteResponse docWriteResponse = documentService.upsertDoc(index, id, JSONObject.parse(document));
        return docWriteResponse.toString();
    }


    @ApiOperation("删除文档")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "String", name = "index", value = "索引", dataType = "String"),
            @ApiImplicitParam(paramType = "String", name = "id", value = "类型", dataType = "String"),
    })
    @GetMapping("delDocument")
    public String delDocument(@RequestParam String index,  @RequestParam String id) {
        DocWriteResponse docWriteResponse = documentService.deleteDoc(index, id);
        return docWriteResponse.toString();
    }
}
