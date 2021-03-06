package yuqiao.housesearch.house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import yuqiao.housesearch.house.entity.House;
import yuqiao.housesearch.house.mapper.HouseMapper;
import yuqiao.housesearch.house.service.IHouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 房屋信息表 服务实现类
 * </p>
 *
 * @author 浦希成
 * @since 2018-12-01
 */
@Service
@Primary
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements IHouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Override
    public List<House> getAll(int start,int size) {
        return houseMapper.selectAll(start,size);
    }

    @Override
    public int countSum() {
        return houseMapper.countSum();
    }
}


