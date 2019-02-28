package net.filebot.web;

import static net.filebot.WebServices.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AcoustIDClientTest {

	@Test
	public void lookup() throws Exception {
		int duration = 357;
		String fingerprint = "AQADtIkSJWGWREF0XTiH0j_4aAl--JiZ4w8me4GP8FmgIuNRUQzO49vxzBrOg9o69MiDfh8cmtC-4yRysN7RP3io4wvuwF-OWpmRN0KtQ_yHI9fD4wglHReJC7UyFs9l2A00K8IpoVdohImY47tx8RmYZz5SpUQPfRrB6Knw6PgDeBoP_UckjheO30N1wkePnJWgo1lXHdMmHu2WED6qH38g1o3wxDbuOOgJM0PV46G64h-aXC80yseZNcF7MCRxH44Woie0hjscHe-Ol0c-EleCnMEX1cIP8YOeDleQesIVHg96CX9KXPnwHYyQ0GEuhM-Inxt-nEIpGnaTI0xFfFCPVN-IUz--pBqayUHJ7DiaRzlcJh565cXhScdPsNKDPmNhJ0ePHz_a5ch1vMHxL0fjED_eoz8abfgF3UcvfMQJO0c_VHvgIw_RE_h-lD3So4fa5LimFFkWVDtOGseVotxhnsiPH-JPIbyOS47xoRkZVNyOf2gu9CKO5AniDl16mMdfBTcNHzwP_6h1RMePnjpC8ThPVMcznUTJCHmTQZckPEf_4KY3XDn0HumPMsfV40ZzjTOeI5cJvccTI_xnVJ_RnF3wZMxRqYcPH-HHQT9y4HmMZn1QHX9O3ATyHIefoxJ1WC364Dx-_Id2NF-O78F_HP8hqhruXIF-PEfTDeGDH0ec7dCD6Afzoces41Fy46IohMkTaOLxLOVR7oZYG1fhPIeVRccXBf9x_PjxC04oXUUfQf9x5D8qw052dE9X_PiFRwlOE7-EH-V1POKHMyV6Yc9wHOyOeByF7ob44DtiHz92-LiOHx5r-DkqazM6JkqLMLkIPUeeMTGHMztSC_pw2UH-Y184JfiHPtphleij4_jxol2RXtGh7_CRi4FrIrxu0JJy1M8hXgM9Eul0hFCUX-iPH40iGWWoos9XaClL5MKfHlPUDNUi_GB6XGC6HZ8RiYT4HBWFH-G08Lhk9A_uHReJMGeMdoHyD0f4DBYDxOqHHXpSDo4uoY1TlD0ardRwnIH5HL-wUo_QfJC1w3vRa7g4NOPR49FiaPnyDLWO72j-oB6uoBbxBSSFH2J-ZHrgTyilLMfxxbieoM8bWOqF_sTxB312NMEjZD-0vXDWI7sVfHnw49kEbxvyD6oHK8wTVNqQoz2aODmO8EwgSlFxyYavB5_wC-Zy6MR2HZWZ4s3RUEeND2G-Cy0fYUophA9zdPug7HxQ6Tlif0GP_6jVGWdwoZkeFeEX4d3xKGhCET126B_yC09qzLFxJmjiwzquLBri5kkgLkdI4X6QZ3nxG1oikUWkiviJH6dQ_UXUKUj4B3ZMvEqCZ0RvoukRehfkc8hdbJEkDR_44pFE4UtQmwOTI7mQG2-koJl2dMnW499g78F-5MkKUeGOHd-D8IdHmNWJaTl6HWF-oaKkHFomCs9yIacF91Px4wrChTSaSMqDQ_lL5METpcR-_CYaMqh0dIcrpoibWAkS9ijxHXfIFaH5YIrIQ3d6xHtxBtcuTHnQfwH6xQiTasEvaOuPxvuAv4f45DEiTjxOC-xjNKNk0MsCK0s-5BCPXiK-Bg23ByUTdF_g8YPeIGV19Mf3oFwCq1IchCJKFsq4REcs4com_CPCE18SUrgVwT8OfUXzB-FvfDzCZLuE8LiCXA3q7RA_B_VxHdfkCGeWLJiSIz-iuYH2I7qLH194XB6uEvsMP0d-6DhTNMsyVNojaLlQy8eRV8KW58h1QiKPUHQM8-BFzE_wFleCZImeI9dw5kLVJ2hu4hKeCU22Ef0j5FMMrfKRxjl8vMKjHI-VFD1OHpdwJWUiuPwQ34auFOG05UcTKrmAX0Qbw4yOfgh5_Eej48pafBH2awt-QTuaSsKX49MOjXzgFO0YISeNh8SU8-gR_ym6SimaaTvU7fiXwH3w4A76yMOUeId2fEcsBeZy-EfO5NgNcS_88Qi1ZUV5hBF34dCZo9mPsEuwHyX5INWOS5BUkQt6BH3F4yGDM8ipwyjJCxI36bhSGeaP91D14VsOLTvOUENk3CLxw_GCMs8k5LqgPJUGe0eOqyoaHqEoNRr-QDt9pJIs_MJJ4T2-Y282-DnK47dw8piiHX2WF9dCHA2nTng25BR89MQ-aL_whsZpNDGP56iP5g-OU8zh88G1HPsBJo9o5Dku6uBrpCMFXscDHfGews9xEdwEq5lX9A3-GWeOkKSFd1DOIqY4Hn6Y4VqGi3CbYEfqSNGgUUN-tI_RxIlKXLvQ_3AlSXjwG9s0HPEjw1cUEQ95NORxXsnwQzOHZox6fDJVtEriCdEdPDv-40qHbQy6aTk-hRs-nDLjIOzoQstDHQ9znMpj5HnQJIoz9ImOfRvxI_-hWccX5Ecz5ngehDq0yFHwZYiPZsthRjzKp8Md1EcjNgUvCdUPJu2NZ0VjYnrQ0_CmBZWyR0L4CI2I53gyFukf5JIXrFl46FsY4ZlYI3yKreJRPvhxPfCD4x-uJ4hW4YOeIoym4wp44Q9-1Br4EkUan4FW5fi2DCEpqcJ14cqLhykaLjt-4TuJnkGaBqJ0IdTH4NTRS0ZzGR-aM6jEH8mj5EF-NNfRJ3jwJwgDzd6QH1eiRMe5JHiP5sHxMFmQ94Oq7BLC3XiPqy9Cicmh5Q8AoYwQjAlNGAKCOYQAc0IoIARxYjFhBEEAICMMAcBopwgBzCADCBHCImSsMwwCAAwRwCoghRBCGKCQUAIhYJABSACnpHBEEAQA0QIiBKQgAiChgEDCE00YBoAAAkgSADFoiFFIMUkocUA5AAQ1SAjHkBECMEWAUBoARLyTDBApERGEAkGEABQ4QgBzgBEDtDFISE2BAkgASgQChAkEICCIOAYMBZIoQAgBAAjAiDFKicKEEwQACSggRAMnIQBGCYCQkMAxIwAhTiFFICBGWIMUMYhAIhQiTgAiALMMQSAEAAIYIRggAgRNCGJUEGUAMc55bAAjCCJIlmIKEIWUIAABQBQgDiABQYFKAEPEEQQABRgwxiAAjCcCKMagccAQJwgwQABAgEjAGWGIAoAhgSgRUGEjhFACIMgQAwwJwBkQAgggGDDCKAUUMgQxwwggZBARAAAEAmKIEAZBAAgABAAhhBECEIOgIA5owpRhRBFECKBKCIKIJwQAQggxkBDEpCGCG4AIIkQoBQURShAqiAGEAEQAhkYJIpmRBEjiDAMCEGEYMQAQQRwCAiABCGCCgCqIUcAQBAwCTgBBIFCCGQAAEgIjAoBjyhArBAJGIQMIQgAA65iQwAlADAMCMMgEAYQYR5wRABgFjQECAGaEYgAYpRjlQBDoCBCEWScEMIICIIkwgiCkEDFYQEOQIIIA4AhDTAAiAJACAGGEAE5AoIxCQBggKBDIQEeck0IwYoiBTAjEDCBACQBMQ4AgIoAQTCkjGGAACEUBQkw4IojAwAAOACGAIYAE8EoBRAACLhgRgCCIAIWIEAwQASBRBgBDBTBICQCgJIgojBRRDDBhgAAEGCAoFsAyRIwQhBDFHBQCGBKFIhQiBQClRAAlgENCAWYMIcwQQIgDAAACICHIKQMMIEQJQZUwRgGDgDAC";

		String response = AcoustID.lookup(duration, fingerprint);
		AudioTrack info = AcoustID.parseResult(response, duration);

		assertEquals("Michael Jackson", info.getArtist());
		assertEquals("Thriller", info.getTitle());
	}

	@Test
	public void lookupChinese() throws Exception {
		int duration = 265;
		String fingerprint = "AQADtJmWRFJCRkGcHXceND_Oquhz1H_xvjg8D8mYIf5-fOpKVE81NOOF5_hb1PrxJLhhRxfCLkNSOh-61Mvh3DJKOcMnG2eOPsmH_4R_I-SPJB-Df0NTB70-vPiDRtKOS3qK-Duhc8mR9-jyoOvhKhyJH-8FE5eOHHoy3BpC5Tieo_kV9LiZ41McHCF9iJmDPFTQPeiYHD5J_Cfy7DBz_IdxrXBRMTyeP9CSLeJQ8glyC18S5imeSHkSPBeavwgfHrqSD7l09Fl2mGMDVzmekAzS_Gi3HPJbIr0VvD2eJD8u-eAPxytyMccTTQ8u5YmR63iG5jm6UG3wJcmFyzFuNEclvcETfcSb4T-aDz0RWoGs5MQlg9mUBXlyodYjbId_lHke4vPxCFuO5-iNJkw-5FseJM9RckFPHJ-kH3USNL_w4i7xpT5iHvlCVOIR5viFJyFK2Yd59DzqHe8wNUfJF1rwakJTZdB_TJkk5Ntx6YOb7MHj40SZh1ERZv3wD3yaohmzC-2DyM_xND_e48-CWx-6H5FC6ApxpUf-4jpyuEo64VLCZsrwHXcWlBcaDdeWI6Zz5D9qQ0wz4WNPPPCYWWgv6OTw7Ugb_Ghihkd4gdKSqBL0hGyCH1q59GjkHaeQJ0fJLEbz2XiOmBu-RIemG55TDmGPJ3i04zouycIZuMrI4Exz480xqvnxhUS68oHKTD7-I1LGLEX7CteFmNGDD3qO6UvQRNSxKsoVXDnurEHzYWIfPKmFWJqJp3OQP4c5Ukqhx0QeY_-OXj1MLozw6AzqJBmOfNCUKslDhOHB40mGR19wHT0RplRwMsQT5VGG_Kh--D2qKEpU4quFc0Z5NIx4fJIXnHjR73COkNCaJEdF0cifE2SkPHiEJj76Y8qzHO27FE-O79hyS8R59HoQRssV6NKRx6i-o2eKP0ednGiq4Ej1oHeGZgqJnzOeCyEzvmh0XCryaLlRSUJ6YjpxHdd04-qE_kVz_EGNOsR84cuFMJNooWIgNzziKw2anUeZ5cYzBbyI3jnCPB90R0L0hFSBJxfmLLPQHF2T4Ql5nD2eWMFtwnWQL8msQF-MfEezC0x34wue48kRktORUIcbB-fhZw-87ArKI8-E5AmD-mieB7dyXKQYXMvxHDkU5T9K8sTTQ1eLPkeYG992xAweQ-eD5lmDUN_xicaX6PiNM1vxw91InGmOv7ior_AXPDueXbiOhlwkHeUV_DF-5D90Fc1zJCMzK8aT45KNV0XzYvJxJccfIZ-RLEdPKcGzDkdPonmWDMcf4WFy_MGTFVoiGp3WRwOfZMd1PDnxJ4GbCc9O5Eeih2jWo2_AKpPxKMTFHVWOhEdo_AmuD89yNJETdEdSHmGcHEezrjFoCZf0w8Lo7PC54M6DT-vwhEcPP4Hzo9uOH98TJH_TIRJzHNaS4-TBz8nRh8GZFz-eG08f9MzRrDu-iMjWC5eG_wjpoQl_zNHx3mh6BT09o1Zg93iKZj0uhSQmH8nyBHl3VHszUM9RytLwJEqKmT96NC-H41eIHzk0PUeYSx_WCE9y4qaGo7KUomk0C9eJ5L-RfUFzodSLJ3goHX3gHHkJPUMuFdfyJHB8hCeSZxH4BE1vVL6CrkmM6lEePGeK_Ei0v8KTw9GRb3gO_YfjLMgn6agYIh3xfIJ2T8jDodR2OAyso8e3bIrhJgyHHzvyKhCjpxE-MUIezeiD5suW4LzxJEfMlEJy4VFCNNeLUjqeJJ6OP8PNwsfTB9dxHUmeXAgzLuHQ4wljfDqahegj4R2JKzlO5fiDkuERJkfiKVHwxB_OHPyH6soEJk07fB9u6CyF5rmCflFwBdyiRHg4IReSBfWDX8GnHGVGNHOE-NCssEjTHFeNplsPdgmqKBea8eiD5jwuBo-SZ6gkfmhk4U6EpmKOPviJUD-S50WVgE911Id9HX3k4AmHG-9fPAneJ-hBjcWjoPzxHI9JhDSx5awQSlGPWg_8bULPHE2VE30oNNNQb7hyTD4aVUYeQUv2Ivzw1AEd7Wge9Ph-4M_xC89uJEusIVyY4cWTRC_-4-hNNI2WSciP5J3BL_Au4UyPKzgaPUN4yAuP0Dw85jqejE6CUNCRZ8OTo-mD58atGJ0jXjjjIxd09gh7hNnx4UkOnYe_4MQDTWJgaauE8Bc-KmgTDQ_6CleKD6Z8Yufxtwh1QcuCfEmGS4rwE_444TniREmOH-_wCP6MO2mDNUouPNEPTUfzqMPZI1_EB1feHDeFkjzCjMygJznuI2dYouXhS3gfhOXxi9Ap2Uj14DyeJFl6sHrwH37wKRm-8HiUJwnOC-UTNFJ1XMwz4eKDr0GbH54kVJWC78GpVfjRHD2SLcmGb0f44SAj5WgfNGOO5j36K_jUo09mNMWDbrbQOEcsLSeS50fPHL9QUceFKhOP4w_cGKGV489FPD0aJTvKP_hE6EmGpkKZH7ri4FRm44o5oZQ5-Jh-ou_RNImCw1GqTYjMo_aDRsuO__gS-CKefQlyKSf4NEdPGmGOP8eZKbjihzh1nJ_QvEa4Q6VC4UqkIz_-oEeYUH3wRR--C10JD7WOMwquhwbPQ9t6Iw1TXMNPnBciZXkC1YiYRSxq-MI35KikzEoCpcrxLNB2NDlyKcPIGH0OH3eE5wglrdB3hOGH6eKEMw725Oh39DN-NP1RMaGHhznu7Ei_ZIWei7iSCnmOZvbQM1zQ78hTo-aA6ROhJWKi49OxJzdi9fgUlL_RNMm644suXEcsJjua69BsfFpKPDrCV4fPIFe-4IknofKNo9O0Q9L4oFauoBzaiD7eG018oZSj44nW4HlCNPFioa2CPMyFUzye5vjR7mgibTitiRh5Yj7aCQAIMEQoACCQQABhCBNGCMGUEcAYYg1AQCAhDDAAAAagAQAQAAh0BmBCiPAMEHOUAAogASCBBAAklFBEEWaEIkQAAAQjQAgAgHHCIASIA0gQQwQASBggBBFKUCMAIFQSBIQERAnCECRWEACEQJIipYABnIEhACECEUAIs8wg4QRCACBmBCAEKAEIAwYpABSACAAECASCCEKgE04oYBRQChgHhABkAUEAEAIwAwAgQFAgFGMUGcIoA0AIARgAyBhAFKIKCEOIAgQZIARARhgggBGUAYiRAUAIRYQEBABAkBAECOMMIgAIhIQBCiCFCHBMEASAAEoACogoCAFGgGUGWIUAMIgRBIAzhgAFFAJEAEIEgAwZoBgAmCFmhKEMGAAUAAYsQgABgChgNAUGAASIgEAYB4gRQABBBGMGCKEAAIwggShwCChkgGIEGQaocoQBoLRBSACOHALEMQAEAkwAYoAkTDkDICEKIUMQAEQEQRRAgBCJACJCIWSAAKwBQYQABEkCBRHAAEUAoAJIgYBQTAkDAAEIIGEEMIsQx4wAwhgiEQFCGAQQA0oY4gUhCgElgEHEOECEUAYhJAQwxBgJJANIUQKEIYIoARgDhhlAHFBIIAmQQRYhoAhhCBgnLCKEKCEQIQEIR4RTCgkkCAKGCmQQQQAQgAQFgBFBCCGSAwAEIcoIoJQEDCHhEDAKKmCREswQohAgiglkACACKgOhMUAhRgwCBAipEFGMAAGEUABYhAhSAiEFoFEQASGAIAAxJQiESDEHgCEISAEQEAAIJwhAShGoBAUAUCaIUAwIgQgzghgggECAKCIcMQoJxYgSwABlhACAMgMAEkwCpCBzhgADGDACWMIEA0YbIQBiQAAgGCFAKCCEJBAAAYwhAGmiCCOOAIEcMwAIggBzjBhHmHeMSCGIEggiAA0jTCHjCABCAAUQIUQJIowQggFkKBEAGCEBBMQgBIARBkGDCCFGCMMMIIAgQBgSSAI";

		String response = AcoustID.lookup(duration, fingerprint);
		AudioTrack info = AcoustID.parseResult(response, duration);

		assertEquals("周杰倫", info.getArtist());
		assertEquals("聽媽媽的話", info.getTitle());
	}

}
