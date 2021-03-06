package zkz.kehu.service;


import zkz.kehu.pojo.Brand;
import zkz.kehu.pojo.PageResult;

public interface BrandService {

    /**
     * 根据查询条件分页并排序查询品牌信息
     *
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @return
     */
    public PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc) ;

}