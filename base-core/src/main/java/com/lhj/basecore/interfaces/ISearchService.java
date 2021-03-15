package com.lhj.basecore.interfaces;

import org.elasticsearch.action.search.SearchResponse;

import java.util.Collection;

public interface ISearchService {

    SearchResponse matchAllQuery(String index);

    SearchResponse termsQuery(String index, String field, Collection<?> values);

    SearchResponse idsQuery(String index, String... ids);

    SearchResponse rangeQuery(String index, String field, Object gte, Object lte);

    SearchResponse matchQuery(String index, String field, Object text);

    SearchResponse matchPhraseQuery(String index, String field, Object text);

    SearchResponse queryStringQuery(String index, String queryString);

    SearchResponse queryByJson(String index, String contentJson);

}
