 package com.sailmi.tools.lucene;
 
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.DoublePoint;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;

import com.sailmi.tools.CommUtil;
 
 public class ShopQueryParser extends QueryParser
 {
   public ShopQueryParser(String f, Analyzer a)
   {
     super(f, a);
   }
 
   protected Query getRangeQuery(String field, String part1, String part2, boolean inclusive)
     throws ParseException
   {
     if ("store_price".equals(field)) {
       return DoublePoint.newRangeQuery(field, 
         Double.valueOf(CommUtil.null2Double(part1)), Double.valueOf(CommUtil.null2Double(part2)) 
  );
     }
     if ("add_time".equals(field)) {
       return DoublePoint.newRangeQuery(field, Long.valueOf(Long.parseLong(part1)), 
         Long.valueOf(Long.parseLong(part2)));
     }
     return super.newRangeQuery(field, part1, part2, inclusive, true);
   }
 }
