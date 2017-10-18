package com.sailmi.mall.foundation.dao;

import com.sailmi.mall.core.base.GenericDAO;
import com.sailmi.mall.foundation.domain.Article;
import org.springframework.stereotype.Repository;

@Repository("articleDAO")
public class ArticleDAO extends GenericDAO<Article>
{
}
