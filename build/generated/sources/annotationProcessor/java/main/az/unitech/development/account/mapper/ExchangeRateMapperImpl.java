package az.unitech.development.account.mapper;

import az.unitech.development.account.entity.ExchangeRateEntity;
import az.unitech.development.account.entity.ExchangeRateEntity.ExchangeRateEntityBuilder;
import az.unitech.development.account.modelDto.ExchangeRateDto;
import az.unitech.development.account.modelDto.ExchangeRateDto.ExchangeRateDtoBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-24T13:42:02-0800",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class ExchangeRateMapperImpl implements ExchangeRateMapper {

    @Override
    public ExchangeRateEntity toEntity(ExchangeRateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ExchangeRateEntityBuilder<?, ?> exchangeRateEntity = ExchangeRateEntity.builder();

        exchangeRateEntity.fromCurrency( dto.getFromCurrency() );
        exchangeRateEntity.toCurrency( dto.getToCurrency() );
        exchangeRateEntity.rate( dto.getRate() );

        return exchangeRateEntity.build();
    }

    @Override
    public List<ExchangeRateEntity> toEntity(List<ExchangeRateDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ExchangeRateEntity> list = new ArrayList<ExchangeRateEntity>( dtoList.size() );
        for ( ExchangeRateDto exchangeRateDto : dtoList ) {
            list.add( toEntity( exchangeRateDto ) );
        }

        return list;
    }

    @Override
    public ExchangeRateDto toDto(ExchangeRateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ExchangeRateDtoBuilder exchangeRateDto = ExchangeRateDto.builder();

        exchangeRateDto.rate( entity.getRate() );
        exchangeRateDto.toCurrency( entity.getToCurrency() );
        exchangeRateDto.fromCurrency( entity.getFromCurrency() );

        return exchangeRateDto.build();
    }

    @Override
    public List<ExchangeRateDto> toDto(List<ExchangeRateEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ExchangeRateDto> list = new ArrayList<ExchangeRateDto>( entityList.size() );
        for ( ExchangeRateEntity exchangeRateEntity : entityList ) {
            list.add( toDto( exchangeRateEntity ) );
        }

        return list;
    }
}
