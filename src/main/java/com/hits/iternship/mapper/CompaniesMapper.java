package com.hits.iternship.mapper;

import com.hits.iternship.dto.companies.CompanyFullDto;
import com.hits.iternship.dto.companies.CompanyShortDto;
import com.hits.iternship.dto.companies.RepresentativesDto;

import com.hits.iternship.dto.contacts.ContactsFullDto;
import com.hits.iternship.dto.contacts.ContactsShortDto;
import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.companies.RepresentativesEntity;
import com.hits.iternship.entities.contacts.ContactsEntity;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
@RequiredArgsConstructor
public class CompaniesMapper {
    private final ModelMapper modelMapper;



    public CompanyShortDto toCompanyShortDto(CompanyEntity companyEntity) {
        return Objects.isNull(companyEntity) ? null :
                modelMapper.map(companyEntity, CompanyShortDto.class);
    }


    public CompanyFullDto toCompanyFullDto(CompanyEntity companyEntity) {



        CompanyFullDto myCompanyDto = modelMapper.map(companyEntity,CompanyFullDto.class); // Тут лежит замапленное компани ентети, но с нулл по маппингу в плане представителей и контактов

////////////////////////////////////////////////////////////////////////Маппинг репрезентативисов////////////////////
        List<RepresentativesEntity> representativesEntityList = companyEntity.getRepresentatives();
        List<RepresentativesDto> representativesDtoList = new ArrayList<>();

        List<ContactsShortDto> repDtoContactsShortsListDto = new ArrayList<>();
        for(RepresentativesEntity oneRepEnt : representativesEntityList) {
              List<ContactsEntity> repContactsList = oneRepEnt.getContacts();  //Здесь лежит лист ентети контактов представителя
            for (ContactsEntity repContactsToDto : repContactsList
                 ) {
                    ContactsShortDto firstRepShortContatactDto = modelMapper.map(repContactsToDto, ContactsShortDto.class);
                    repDtoContactsShortsListDto.add(firstRepShortContatactDto);
                    //ПО ИДЕЕ ТУТ НАДО СДЕЛАТЬ СЕТ КОНТАКТОВ НАШЕМУ РЕПРЕЗЕНТАТИВИСУ
            }

              RepresentativesDto firstRepDto = modelMapper.map(oneRepEnt, RepresentativesDto.class); //
              RepresentativesDto FRepDtoPlusContacts = firstRepDto;
              FRepDtoPlusContacts.setContactsShortDto(repDtoContactsShortsListDto);
             // representativesDtoList.add(firstRepDto);//
              representativesDtoList.add(FRepDtoPlusContacts);
        } // тут вроде получилось замапить репрезентативитес и сложить в новый лист

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////Маппинг контактов компании//////////////////////////////////

    List<ContactsEntity> contactsFullListEntity = companyEntity.getContacts();
    List<ContactsFullDto> contactsFullDtoList = new ArrayList<>();
    for(ContactsEntity contactsEntityToDto : contactsFullListEntity)
        {
            ContactsFullDto firstContactsFullDto = modelMapper.map(contactsEntityToDto, ContactsFullDto.class);
            contactsFullDtoList.add(firstContactsFullDto);
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        CompanyFullDto myCompanyDtoReady = myCompanyDto;
        myCompanyDtoReady.setRepresentativesDto(representativesDtoList);
        myCompanyDtoReady.setContactsFullDto(contactsFullDtoList);

      //  myCompanyDto.getRepresentativesDto();

        return  myCompanyDtoReady;

        //  return myCompanyDto; // ЗАМАПИЛ В МАППИНГЕ
        /*  return Objects.isNull(companyEntity) ? null :
                modelMapper.map(companyEntity, CompanyFullDto.class);
                */

    }



    public RepresentativesDto toRepresentativesDto(RepresentativesEntity representativesEntity) {



        return Objects.isNull(representativesEntity) ? null :
                modelMapper.map(representativesEntity, RepresentativesDto.class);
    }
}
