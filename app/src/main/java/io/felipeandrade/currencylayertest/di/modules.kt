package io.felipeandrade.currencylayertest.di

import io.felipeandrade.currencylayertest.ui.currency.conversion.CurrencyConversionViewModel
import io.felipeandrade.currencylayertest.ui.currency.selection.CurrencyListAdapter
import io.felipeandrade.currencylayertest.ui.currency.selection.CurrencySelectionViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val currencyModule = module(override = true) {
    viewModel { CurrencyConversionViewModel() }
    viewModel { CurrencySelectionViewModel() }
    factory { CurrencyListAdapter() }
}

