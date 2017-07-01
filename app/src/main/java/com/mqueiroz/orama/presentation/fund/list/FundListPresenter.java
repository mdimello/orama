package com.mqueiroz.orama.presentation.fund.list;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mqueiroz.orama.domain.Fund;
import com.mqueiroz.orama.domain.FundDeserializer;

class FundListPresenter implements FundListContract.Presenter
{
    private FundListContract.View mView;



    FundListPresenter( FundListContract.View view )
    {
        mView = view;

        GsonBuilder gsonBuilder = new GsonBuilder( );
        gsonBuilder.registerTypeAdapter( Fund.class, new FundDeserializer( ) );
        Gson gson = gsonBuilder.create( );

        Fund fund = gson.fromJson( fundtext, Fund.class );
    }



    String fundtext = "{\n" + "        \"initial_date\": \"2005-04-05\",\n" + "        \"performance_audios\": [],\n" +
            "        \"operability\": {\n" + "            \"has_operations_on_thursdays\": true,\n" +
            "            \"retrieval_liquidation_days_type\": \"úteis\",\n" +
            "            \"application_quotation_days_type\": \"corridos\",\n" +
            "            \"retrieval_quotation_days\": 0,\n" +
            "            \"anticipated_retrieval_quotation_days_str\": \"Não há\",\n" +
            "            \"retrieval_quotation_days_type\": \"úteis\",\n" +
            "            \"anticipated_retrieval_quotation_days\": 0,\n" +
            "            \"has_operations_on_wednesdays\": true,\n" +
            "            \"minimum_balance_permanence\": \"10000.00\",\n" +
            "            \"has_operations_on_tuesdays\": true,\n" +
            "            \"minimum_initial_application_amount\": \"10000.00\",\n" +
            "            \"application_time_limit\": \"14:00:59\",\n" +
            "            \"has_operations_on_mondays\": true,\n" +
            "            \"retrieval_time_limit\": \"14:00:59\",\n" +
            "            \"has_operations_on_fridays\": true,\n" + "            \"retrieval_special_type\": \"\",\n" +
            "            \"application_quotation_days_str\": \"D+0\",\n" +
            "            \"retrieval_quotation_days_str\": \"D+0\",\n" +
            "            \"retrieval_liquidation_days_str\": \"D+1 da data de conversão de resgate\",\n" +
            "            \"application_quotation_days\": 0,\n" + "            \"retrieval_liquidation_days\": 1,\n" +
            "            \"anticipated_retrieval_quotation_days_type\": \"corridos\",\n" +
            "            \"minimum_subsequent_application_amount\": \"1000.00\"\n" + "        },\n" +
            "        \"full_name\": \"JPM Income Class Fundo de Investimento Renda Fixa – Longo Prazo\",\n" +
            "        \"fees\": {\n" + "            \"administration_fee\": \"0,4%\",\n" +
            "            \"maximum_administration_fee\": \"0,8%\",\n" +
            "            \"has_anticipated_retrieval\": false,\n" +
            "            \"performance_fee\": \"20% do que exceder o CDI\",\n" +
            "            \"anticipated_retrieval_fee\": \"Não há\"\n" + "        },\n" + "        \"id\": 94,\n" +
            "        \"is_closed\": false,\n" + "        \"simple_name\": \"JP Morgan Income Class FIRF LP\",\n" +
            "        \"target_fund\": null,\n" + "        \"documents\": [\n" + "            {\n" +
            "                \"position\": 1,\n" + "                \"document_type\": \"3\",\n" +
            "                \"name\": \"Regulamento\",\n" + "                \"document_url\": " +
            "\"app_img/fund_document/REGULAMENTO_JPM_INCOME_CLASS_2016_06_07.pdf\"\n" + "            },\n" +
            "            {\n" + "                \"position\": 3,\n" + "                \"document_type\": \"0\",\n" +
            "                \"name\": \"Formulário de Informações Complementares\",\n" +
            "                \"document_url\": " +
            "\"app_img/fund_document/FORM_INFO_COMP_-_JPM_INCOME_CLASS_2016_06_07.pdf\"\n" + "            },\n" +
            "            {\n" + "                \"position\": 3,\n" + "                \"document_type\": \"0\",\n" +
            "                \"name\": \"Demonstração de Desempenho do Fundo\",\n" +
            "                \"document_url\": \"app_img/fund_document/DDF_-_junho_2016_-_JPM_INCOME_CLASS.pdf\"\n" +
            "            },\n" + "            {\n" + "                \"position\": 3,\n" +
            "                \"document_type\": \"1\",\n" + "                \"name\": \"Lâmina\",\n" +
            "                \"document_url\": " +
            "\"app_img/fund_document/Lâmina_-_201704_-_JP_Morgan_Income_Class_FIRF_LP.pdf\"\n" + "            }\n" +
            "        ],\n" + "        \"specification\": {\n" + "            \"fund_suitability_profile\": {\n" +
            "                \"score_range_order\": 1,\n" + "                \"name\": \"Conservador\"\n" +
            "            },\n" + "            \"fund_risk_profile\": {\n" +
            "                \"score_range_order\": 2,\n" + "                \"name\": \"Régua de risco 2\"\n" +
            "            },\n" + "            \"is_qualified\": false,\n" +
            "            \"fund_type\": \"Renda Fixa\",\n" +
            "            \"fund_class\": \"Renda Fixa Duração Livre Grau de Investimento\",\n" +
            "            \"fund_macro_strategy\": {\n" +
            "                \"explanation\": \"Fundos que buscam retorno por meio de investimentos em ativos de " +
            "renda fixa. São indicados para a parcela conservadora da carteira do investidor. Podem investir em " +
            "títulos públicos e/ ou em títulos privados, com remuneração prefixada, pós-fixada ou atrelada a algum " +
            "índice de preço.\",\n" + "                \"id\": 1,\n" + "                \"name\": \"Renda Fixa\"\n" +
            "            },\n" + "            \"fund_main_strategy\": {\n" +
            "                \"explanation\": \"Fundos que investem  pelo menos 80% de seus recursos em ativos de " +
            "renda fixa com limite de até 50% em crédito privado.\",\n" +
            "                \"fund_macro_strategy\": 1,\n" + "                \"id\": 3,\n" +
            "                \"name\": \"Renda Fixa\"\n" + "            }\n" + "        },\n" +
            "        \"benchmark\": {\n" + "            \"id\": 2,\n" + "            \"name\": \"CDI\"\n" +
            "        },\n" + "        \"tax_classification\": \"Longo prazo\",\n" +
            "        \"cnpj\": \"06.969.451/0001-18\",\n" + "        \"description\": {\n" +
            "            \"objective\": \"O FUNDO tem como objetivo de investimento buscar proporcionar a valorização" +
            " de suas cotas por meio, preponderantemente, de aplicações de recursos da sua carteira de investimentos " +
            "(“CARTEIRA”) em ativos financeiros e/ou modalidades operacionais de renda fixa disponíveis nos mercados " +
            "financeiro e de capitais em geral, excluindo-se estratégias que impliquem exposição de moeda estrangeira" +
            " ou de renda variável.\",\n" + "            \"movie_url\": \"\",\n" +
            "            \"target_audience\": \"Investidores em Geral.\",\n" +
            "            \"strengths\": \"Indicado para investidores conservadores que priorizam a estabilidade e " +
            "alta liquidez. \",\n" +
            "            \"strategy\": \"Fundo classificado como Renda Fixa, com meta de retorno de 103-104% do CDI. " +
            "A carteira do Fundo é composta por títulos do governo e uma parcela de 30 a 35% em títulos de crédito " +
            "privado com grau de investimento.\"\n" + "        },\n" + "        \"performance_videos\": [\n" +
            "            {\n" + "                \"description\": \"Descrição\",\n" +
            "                \"title\": \"Fundo JP Morgan Income Class, Rentabilidade Jul/2016 - Órama\",\n" +
            "                \"url\": \"http://www.youtube.com/watch?v=Hrg5s10hm_w\",\n" +
            "                \"published\": \"2016-07-29T19:59:01\",\n" + "                \"id\": 1680,\n" +
            "                \"enabled_for_tvorama\": true,\n" + "                \"youtube_id\": \"Hrg5s10hm_w\",\n" +
            "                \"thumbnail\": \"http://i.ytimg.com/vi/Hrg5s10hm_w/hqdefault.jpg\"\n" +
            "            },\n" + "            {\n" + "                \"description\": \"\",\n" +
            "                \"title\": \"Fundo JP Morgan Income Class, Rentabilidade Abr/2016 - Órama\",\n" +
            "                \"url\": \"http://www.youtube.com/watch?v=ApAKSd_IlCs\",\n" +
            "                \"published\": \"2016-05-16T14:24:26\",\n" + "                \"id\": 1583,\n" +
            "                \"enabled_for_tvorama\": true,\n" + "                \"youtube_id\": \"ApAKSd_IlCs\",\n" +
            "                \"thumbnail\": \"http://i.ytimg.com/vi/ApAKSd_IlCs/hqdefault.jpg\"\n" + "            }\n" +
            "        ],\n" + "        \"quota_date\": \"2017-06-29\",\n" + "        \"is_active\": true,\n" +
            "        \"slug\": \"jp-morgan-income-class-firf-lp\",\n" + "        \"volatility_12m\": \"0.003736\",\n" +
            "        \"strategy_video\": {\n" +
            "            \"description\": \"Estratégia do fundo de renda Fixa Income Class, da renomada gestora JP " +
            "Morgan. http://www.orama.com.br/fundos-de-investimento/jpm-income-class/\\n\\nÓrama: invista nos " +
            "melhores Fundos de Investimento pra você com apenas R$ 1 mil. Conheça também nossos produtos de renda " +
            "fixa. http://www.orama.com.br/\",\n" +
            "            \"title\": \"Estratégia do Fundo JP Morgan Income Class - Órama\",\n" +
            "            \"url\": \"http://www.youtube.com/watch?v=4sW_rC4OnKY\",\n" +
            "            \"published\": \"2015-11-27T11:39:38\",\n" + "            \"id\": 1510,\n" +
            "            \"enabled_for_tvorama\": true,\n" + "            \"youtube_id\": \"4sW_rC4OnKY\",\n" +
            "            \"thumbnail\": \"http://i.ytimg.com/vi/4sW_rC4OnKY/hqdefault.jpg\"\n" + "        },\n" +
            "        \"profitabilities\": {\n" + "            \"m60\": \"0.700397\",\n" +
            "            \"m48\": \"0.581624\",\n" + "            \"m24\": \"0.294374\",\n" +
            "            \"m36\": \"0.442638\",\n" + "            \"month\": \"0.007381\",\n" +
            "            \"m12\": \"0.134180\",\n" + "            \"year\": \"0.056400\",\n" +
            "            \"day\": \"0.000230\"\n" + "        },\n" +
            "        \"closed_to_capture_explanation\": \"\",\n" +
            "        \"net_patrimony_12m\": \"109346816.66\",\n" + "        \"is_closed_to_capture\": false,\n" +
            "        \"fund_manager\": {\n" +
            "            \"description\": \"O J.P. Morgan Asset Management atua no mercado de investimentos há 150 " +
            "anos. Conta com mais de 1,8 trilhão de dólares¹ em recursos sob gestão e 1.300 especialistas " +
            "distribuídos em mais de 41 países.\\r\\nNo Brasil, somos responsáveis por gerir aproximadamente 24 " +
            "bilhões de reais*, desenvolvendo soluções de investimento inovadoras, adequadas a cada um dos objetivos " +
            "de nossos clientes. Por meio de um sólido processo de investimento, focamos nossos esforços na busca de " +
            "resultados consistentes e diferenciados, combinando nossa experiência no mercado local e conhecimento " +
            "dos mais diversos mercados internacionais.\\r\\n\\r\\n \\r\\n\\r\\n¹Dados de 30/jun/2015. Fonte: J.P. " +
            "Morgan Asset Management\\r\\n\\r\\n*Dados de 31/jul/2015. Fonte: Anbima. (Número relativo ao " +
            "conglomerado J.P.Morgan).\",\n" + "            \"id\": 26,\n" +
            "            \"full_name\": \"Banco J.P. Morgan S.A.\",\n" +
            "            \"logo\": \"app_img/manager/logo_small/jpmorgan.jpg\",\n" +
            "            \"slug\": \"JP-Morgan\",\n" + "            \"name\": \"JP Morgan\"\n" + "        }\n" +
            "    }";
}
