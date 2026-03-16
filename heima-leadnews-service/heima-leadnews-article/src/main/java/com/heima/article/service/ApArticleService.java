package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.article.pojos.ApArticle;
import com.heima.model.common.enums.dtos.ResponseResult;

public interface ApArticleService extends IService<ApArticle> {
    /**
     * load article lists
     * @param dto
     * @param type 1. load more 2. load newest
     * @return
     */

public ResponseResult load(ArticleHomeDto dto,Short type);
}

