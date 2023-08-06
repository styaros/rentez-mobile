package com.example.rentez.data.repositories

import com.example.rentez.data.api.apis.CompanyApi
import com.example.rentez.data.mappers.CompanyMapper
import com.example.rentez.domain.repositories.CompanyRepository

class CompanyRepositoryImpl(
    private val companyApi: CompanyApi,
    private val companyMapper: CompanyMapper
) : CompanyRepository {
}