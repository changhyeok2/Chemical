package com.example.python.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageHandler {
    private int totalCnt;
    private int pageSize;
    private int naviSize = 5;
    private int totalPage;
    private int page;
    private int beginPage;
    private int endPage;
    private boolean firstPage;
    private boolean lastPage;

    public PageHandler(int totalCnt, int pageSize, int page) {
        this.totalCnt = totalCnt;
        this.pageSize = pageSize;
        this.page = page;

        totalPage = (int) Math.ceil((double) totalCnt / pageSize);
        beginPage = (page - 1) / naviSize * naviSize + 1;
        endPage = Math.min(beginPage + naviSize - 1, totalPage);
        firstPage = (beginPage == 1);
        lastPage = (endPage == totalPage);
    }
}
