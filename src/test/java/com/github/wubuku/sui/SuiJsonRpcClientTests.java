package com.github.wubuku.sui;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wubuku.sui.bean.*;
import com.github.wubuku.sui.utils.SuiJsonRpcClient;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.util.List;

public class SuiJsonRpcClientTests {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void testGetMoveEvents_1() throws MalformedURLException, JsonProcessingException {
        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
        PaginatedMoveEvents<JsonRpcTests.MintNFTEvent> moveEvents = client.getMoveEvents(
                "0x2::devnet_nft::MintNFTEvent",
                null, 1, true, JsonRpcTests.MintNFTEvent.class);
        System.out.println(moveEvents);
        System.out.println(objectMapper.writeValueAsString(moveEvents));
    }

//    @Test
//    void testGetMoveEvents_2() throws MalformedURLException, JsonProcessingException {
//        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
//        PaginatedEvents events = client.getEvents(
//                new EventQuery.Transaction("7ZgBRkqQbbZNJB7AoKUfagYUucc8ZQPmqrTdk2G13SQP"),
//                null, 10, false);
//        System.out.println(events);
//        System.out.println(objectMapper.writeValueAsString(events));
//    }

    @Test
    void testGetTransaction_1() throws MalformedURLException, JsonProcessingException {
        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
        SuiTransactionResponse suiTransactionResponse = client.getTransaction("FJTkcJRV3sxn5GuG4PVJuT5U2qP2ZnfDgcFWdASiBgjU");
        System.out.println(suiTransactionResponse);
        System.out.println(objectMapper.writeValueAsString(suiTransactionResponse));
    }

    @Test
    void testGetObjectsOwnedByAddress_1() throws MalformedURLException, JsonProcessingException {
        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
        List<SuiObjectInfo> suiObjectInfoList = client.getObjectsOwnedByAddress("0x3c2cf35a0d4d29dd9d1f6343a6eafe03131bfafa");
        System.out.println(suiObjectInfoList);
        System.out.println(objectMapper.writeValueAsString(suiObjectInfoList));
    }

    @Test
    void testGetObject_1() throws MalformedURLException, JsonProcessingException {
        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
        GetObjectDataResponse getObjectDataResponse = client.getObject("0x0b7a32cfbfbe22b55f3ad703b1b6af130266086e");
        System.out.println(getObjectDataResponse);
        System.out.println(objectMapper.writeValueAsString(getObjectDataResponse));
    }

    @Test
    void testGetCoins_1() throws MalformedURLException, JsonProcessingException {
        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
        CoinPage coinPage = client.getCoins("0x3c2cf35a0d4d29dd9d1f6343a6eafe03131bfafa",
                "0x2::sui::SUI", null, 1);
        System.out.println(coinPage);
        System.out.println(objectMapper.writeValueAsString(coinPage));
    }

//    @Test
//    void testGetCoins_2() throws MalformedURLException, JsonProcessingException {
//        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
//        CoinPage coinPage = client.getAllCoins("0x3c2cf35a0d4d29dd9d1f6343a6eafe03131bfafa",
//                null, 1);
//        System.out.println(coinPage);
//        System.out.println(objectMapper.writeValueAsString(coinPage));
//    }


    @Test
    void testGetTotalSupply_1() throws MalformedURLException {
        SuiJsonRpcClient client = new SuiJsonRpcClient("https://fullnode.devnet.sui.io/");
        Supply totalSupply = client.getTotalSupply("0x2::sui::SUI");
        System.out.println(totalSupply);
    }
}
