package com.heima.article.controller.v1;

import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.enums.dtos.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author Nmh
 * @version 1.0
 * @description TODO
 * @date 1/8/2026
 */
@RestController
@RequestMapping("/api/v1/article")
public class ArticleHomeController {
    /**
     * loading pgae
     * @param  dto
     * @return
     */
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto dto){
        return null;

    }
    /**
     * loading more
     * @param  dto
     * @return
     */
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto dto){
        return null;

    }
    /**
     * loading latest
     * @param  dto
     * @return
     */
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto dto){
        return null;

    }
}
