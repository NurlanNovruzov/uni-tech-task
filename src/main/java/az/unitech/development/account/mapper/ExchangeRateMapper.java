package az.unitech.development.account.mapper;



import az.unitech.development.account.entity.ExchangeRateEntity;
import az.unitech.development.account.modelDto.ExchangeRateDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Configuration;

@Configuration
@Mapper(componentModel = "spring")
public interface ExchangeRateMapper extends EntityMapper<ExchangeRateDto, ExchangeRateEntity> {

    ExchangeRateMapper INSTANCE = Mappers.getMapper(ExchangeRateMapper.class);

}
