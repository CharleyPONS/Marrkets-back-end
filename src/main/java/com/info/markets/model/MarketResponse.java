package com.info.markets.model;

import lombok.Data;

import java.util.List;

@Data
public class MarketResponse {
    public PaginationResponseApi pagination;
    public List<MarketResponseApiData> data;
}