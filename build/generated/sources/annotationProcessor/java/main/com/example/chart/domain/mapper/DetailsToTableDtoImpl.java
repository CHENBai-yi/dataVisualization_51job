package com.example.chart.domain.mapper;

import com.example.chart.domain.pojo.Details;
import com.example.chart.domain.vo.ChartVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-25T21:32:39+0800",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
public class DetailsToTableDtoImpl implements DetailsToTableDto {

    @Override
    public ChartVo.TableDto getTableDto(Details details) {
        if ( details == null ) {
            return null;
        }

        ChartVo.TableDto.TableDtoBuilder tableDto = ChartVo.TableDto.builder();

        tableDto.jobname( details.getJobname() );
        tableDto.jobareastring( details.getJobareastring() );
        tableDto.providesalarystring( details.getProvidesalarystring() );
        tableDto.workyearstring( details.getWorkyearstring() );
        tableDto.degreestring( details.getDegreestring() );
        tableDto.companyname( details.getCompanyname() );
        tableDto.companytypestring( details.getCompanytypestring() );
        tableDto.companysizestring( details.getCompanysizestring() );
        tableDto.hrname( details.getHrname() );
        tableDto.hrlabels( details.getHrlabels() );
        tableDto.jobhref( details.getJobhref() );

        tableDto.hrisonline( details.getHrisonline()==1?"在线":"离线" );

        return tableDto.build();
    }

    @Override
    public List<ChartVo.TableDto> getTableDtos(List<Details> details) {
        if ( details == null ) {
            return null;
        }

        List<ChartVo.TableDto> list = new ArrayList<ChartVo.TableDto>( details.size() );
        for ( Details details1 : details ) {
            list.add( getTableDto( details1 ) );
        }

        return list;
    }
}
