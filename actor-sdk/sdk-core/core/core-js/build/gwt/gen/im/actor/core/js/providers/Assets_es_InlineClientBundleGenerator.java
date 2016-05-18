package im.actor.core.js.providers;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Assets_es_InlineClientBundleGenerator implements im.actor.core.js.providers.Assets {
  private static Assets_es_InlineClientBundleGenerator _instance0 = new Assets_es_InlineClientBundleGenerator();
  private void AppText_Ar_jsonInitializer() {
    AppText_Ar_json = new com.google.gwt.resources.client.TextResource() {
      // file:/E:/actor/actor-platform/actor-sdk/sdk-core/core/core-js/build/resources/main/AppText_Ar.json
      public String getText() {
        return "{\r\n	\"app\": {\r\n		\"name\": \"Actor\"\r\n	},\r\n\r\n	\"language\": {\r\n		\"code\": \"Ar\",\r\n\r\n		\"format\": {\r\n			\"time\": {\r\n				\"yesterday\": \"امس\",\r\n				\"now\": \"الان\",\r\n				\"minutes\": \"{minutes} دقايق\",\r\n				\"hours\": \"{hours} ساعات\"\r\n			}\r\n		},\r\n\r\n		\"file_size\": {\r\n			\"bytes\": \"{bytes} بايت\",\r\n			\"kbytes\": \"{kbytes} كيلو بايت\",\r\n			\"mbytes\": \"{mbytes} ميجا بايت\",\r\n			\"gbytes\": \"{gbytes} جيجا بايت\"\r\n		},\r\n\r\n		\"referencing\": {\r\n			\"you\": \"انت\",\r\n			\"thee\": \"انت\"\r\n		},\r\n\r\n		\"sequence\": {\r\n			\"or\": \",\",\r\n			\"and\": \",\"\r\n		}\r\n	},\r\n\r\n	\"groups\": {\r\n		\"members\": \"{count} اعضاء\"\r\n	},\r\n\r\n	\"presence\": {\r\n		\"online\": \"متصل\",\r\n		\"offline\": \"غير متصل\",\r\n		\"now\": \"اخر ظهور من\",\r\n		\"today\": \"اخر ظهور اليوم {time}\",\r\n		\"yesterday\": \"اخر ظهور بالامس {time}\",\r\n		\"at_day\": \"اخر ظهور {date}\",\r\n		\"at_day_time\": \"اخر ظهور {date} على {time}\",\r\n		\"members\": \"{count} متصلين\"\r\n	},\r\n\r\n	\"typing\": {\r\n		\"simple\": \"كتابة...\",\r\n		\"user\": \"{user} يكتب...\",\r\n		\"group\": {\r\n			\"sequenced\": \"{users} يكتبون...\",\r\n			\"many\": \"{count} اشخاص يكتبون...\"\r\n		}\r\n	},\r\n\r\n	\"content\": {\r\n\r\n		\"unknown\": \"غير مدعوم\",\r\n		\"document\": \"مستند\",\r\n		\"photo\": \"صورة\",\r\n		\"video\": \"فيديو\",\r\n		\"audio\": \"Audio\",\r\n		\"contact\": \"Contact\",\r\n		\"location\": \"Location\",\r\n		\"sticker\": \"Sticker\",\r\n\r\n		\"service\": {\r\n			\"registered\": {\r\n				\"full\": \"{name} انضم لشبكة اكتور {app_name}\",\r\n				\"compact\": \"انضم لأكتور {app_name}\"\r\n			},\r\n			\"groups\": {\r\n				\"created\": \"{name} انشأ المجموعة\",\r\n				\"invited\": \"{name} دعى {name_added}\",\r\n				\"joined\": \"{name} انصم للمجموعة\",\r\n				\"kicked\": \"{name} ازال {name_kicked}\",\r\n				\"left\": \"{name} غادر\",\r\n				\"title_changed\": {\r\n					\"full\":  \"{name} غير الاسم الى \\\"{title}\\\"\",\r\n					\"compact\": \"{name} غير اسم المجموعة الى\"\r\n				},\r\n				\"topic_changed\": {\r\n					\"full\":  \"{name} changed the group topic to \\\"{topic}\\\"\",\r\n					\"compact\": \"{name} changed the group topic\"\r\n				},\r\n				\"about_changed\": {\r\n					\"full\":  \"{name} changed the group about to \\\"{about}\\\"\",\r\n					\"compact\": \"{name} changed the group about\"\r\n				},\r\n				\"avatar_changed\": \"{name} غير صورة المجموعة\",\r\n				\"avatar_removed\": \"{name} حذف صورة المجموعة\"\r\n			},\r\n			\"calls\": {\r\n				\"missed\": \"Missed call\",\r\n				\"ended\": \"Call ended\"\r\n			}\r\n		}\r\n	},\r\n\r\n	\"errors\": {\r\n		\"unknown\": \"Unknown error. Please, try again later.\",\r\n		\"internal\": \"Internal server error. Please, try again later.\",\r\n		\"phone\": {\r\n			\"empty\": \"Please, enter your phone number.\",\r\n			\"incorrect\": \"Entered phone number is invalid. Please, try again.\"\r\n		},\r\n		\"code\": {\r\n			\"empty\": \"The code is invalid. Please try again.\",\r\n			\"incorrect\": \"Entered code is incorrect. Please, try again.\",\r\n			\"expired\": \"The code has expired. Please, start authentication again.\"\r\n		},\r\n		\"groups\": {\r\n			\"already_joined\": \"You have already joined the group.\",\r\n			\"unable_to_join\": \"Unable to join the group.\"\r\n		}\r\n	},\r\n\r\n	\"months\": {\r\n		\"january\": \"يناير\",\r\n		\"february\": \"فبراير\",\r\n		\"march\": \"مارس\",\r\n		\"april\": \"ابريل\",\r\n		\"may\": \"مايو\",\r\n		\"june\": \"يونيو\",\r\n		\"july\": \"يوليو\",\r\n		\"august\": \"اغسطس\",\r\n		\"september\": \"سمبتمر\",\r\n		\"october\": \"اكتوبر\",\r\n		\"november\": \"نوفمبر\",\r\n		\"december\": \"ديسمبر\"\r\n	}\r\n}";
      }
      public String getName() {
        return "AppText_Ar_json";
      }
    }
    ;
  }
  private static class AppText_Ar_jsonInitializer {
    static {
      _instance0.AppText_Ar_jsonInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return AppText_Ar_json;
    }
  }
  public com.google.gwt.resources.client.TextResource AppText_Ar_json() {
    return AppText_Ar_jsonInitializer.get();
  }
  private void AppText_Es_jsonInitializer() {
    AppText_Es_json = new com.google.gwt.resources.client.TextResource() {
      // file:/E:/actor/actor-platform/actor-sdk/sdk-core/core/core-js/build/resources/main/AppText_Es.json
      public String getText() {
        return "{\r\n	\"app\": {\r\n		\"name\": \"Actor\"\r\n	},\r\n\r\n	\"language\": {\r\n		\"code\": \"Es\",\r\n\r\n		\"format\": {\r\n			\"time\": {\r\n				\"yesterday\": \"Ayer\",\r\n				\"now\": \"Ahora\",\r\n				\"minutes\": {\r\n					\"short\": \"{minutes} min\",\r\n					\"full\": \"{minutes} minutes\"\r\n				},\r\n				\"hours\": {\r\n					\"short\": \"{hours} hrs\",\r\n					\"full\": \"{hours} hours\"\r\n				}\r\n			}\r\n		},\r\n\r\n		\"file_size\": {\r\n			\"bytes\": \"{bytes} B\",\r\n			\"kbytes\": \"{kbytes} KB\",\r\n			\"mbytes\": \"{mbytes} MB\",\r\n			\"gbytes\": \"{gbytes} GB\"\r\n		},\r\n\r\n		\"referencing\": {\r\n			\"you\": \"Tu\",\r\n			\"thee\": \"Tu\"\r\n		},\r\n\r\n		\"sequence\": {\r\n			\"or\": \", \",\r\n			\"and\": \" and \"\r\n		}\r\n	},\r\n\r\n	\"groups\": {\r\n		\"members\": \"{count} miembros\"\r\n	},\r\n\r\n	\"presence\": {\r\n		\"online\": \"En línea\",\r\n		\"offline\": \"Desconectado\",\r\n		\"now\": \"visto segundos atrás\",\r\n		\"today\": \"últ. vez {time}\",\r\n		\"yesterday\": \"últ. vez ayer {time}\",\r\n		\"at_day\": \"ult. vez el {date}\",\r\n		\"at_day_time\": \"ult. vez el {date} a las {time}\",\r\n		\"members\": \"{count} en línea\"\r\n	},\r\n\r\n	\"typing\": {\r\n		\"simple\": \"escribiendo...\",\r\n		\"user\": \"{user} está escribiendo...\",\r\n		\"group\": {\r\n			\"sequenced\": \"{users} estan escribiendo...\",\r\n			\"many\": \"{count} personas estan escribiendo...\"\r\n		}\r\n	},\r\n\r\n	\"content\": {\r\n\r\n		\"unknown\": \"Contenido no compatible\",\r\n		\"document\": \"Documentos\",\r\n		\"photo\": \"Foto\",\r\n		\"video\": \"Vídeo\",\r\n		\"audio\": \"Audio\",\r\n		\"contact\": \"Contacto\",\r\n		\"location\": \"Localización\",\r\n		\"sticker\": \"Sticker\",\r\n\r\n		\"service\": {\r\n			\"registered\": {\r\n				\"full\": \"{name} unido a la red {app_name}\",\r\n				\"compact\": \"Entro en {app_name}\"\r\n			},\r\n			\"groups\": {\r\n				\"created\": \"{name} сreado el grupo\",\r\n				\"invited\": \"{name} invitó a {name_added}\",\r\n				\"joined\": \"{name} se unió al grupo\",\r\n				\"kicked\": \"{name} expulsaste a {name_kicked}\",\r\n				\"left\": \"{name} elimino el grupo\",\r\n				\"title_changed\": {\r\n					\"full\":  \"{name} cambio el nombre del grupo a \\\"{title}\\\"\",\r\n					\"compact\": \"{name} a modificado el nombre del grupo\"\r\n				},\r\n				\"topic_changed\": {\r\n					\"full\":  \"{name} changed the group topic to \\\"{topic}\\\"\",\r\n					\"compact\": \"{name} changed the group topic\"\r\n				},\r\n				\"about_changed\": {\r\n					\"full\":  \"{name} changed the group about to \\\"{about}\\\"\",\r\n					\"compact\": \"{name} changed the group about\"\r\n				},\r\n				\"avatar_changed\": \"{name} modificada la foto de grupo\",\r\n				\"avatar_removed\": \"{name} eliminada la foto de grupo\"\r\n			},\r\n			\"calls\": {\r\n				\"missed\": \"Llamada perdida\",\r\n				\"ended\": \"Llamada finalizada\"\r\n			}\r\n		}\r\n	},\r\n\r\n	\"errors\": {\r\n		\"unknown\": \"Unknown error. Please, try again later.\",\r\n		\"internal\": \"Error Interno del Servidor. Por favor, inténtelo de nuevo más tarde.\",\r\n		\"phone\": {\r\n			\"empty\": \"Por favor, introduce tu número de teléfono.\",\r\n			\"incorrect\": \"Número de teléfono introducido no es válido. Por favor, vuelve a intentarlo.\"\r\n		},\r\n		\"code\": {\r\n			\"empty\": \"Código no válido. Por favor, vuelve a intentarlo.\",\r\n			\"incorrect\": \"El código introducido es incorrecta. Por favor, vuelve a intentarlo.\",\r\n			\"expired\": \"Código expirado. Por favor, inicia la autenticación de nuevo.\"\r\n		},\r\n		\"groups\": {\r\n			\"already_joined\": \"Ya eres miembro del grupo.\",\r\n			\"unable_to_join\": \"No puede unirse al grupo.\"\r\n		}\r\n	},\r\n\r\n	\"months\": {\r\n		\"january\": { \r\n			\"compact\": \"ene\",\r\n			\"full\":\"enero\"\r\n		},\r\n		\"february\": { \r\n			\"compact\": \"feb\",\r\n			\"full\":\"febrero\"\r\n		},\r\n		\"march\": { \r\n			\"compact\": \"mar\",\r\n			\"full\":\"marzo\"\r\n		},\r\n		\"april\": { \r\n			\"compact\": \"apr\",\r\n			\"full\":\"abril\"\r\n		},\r\n		\"may\": { \r\n			\"compact\": \"may\",\r\n			\"full\":\"mayo\"\r\n		},\r\n		\"june\": { \r\n			\"compact\": \"jun\",\r\n			\"full\":\"junio\"\r\n		},\r\n		\"july\": { \r\n			\"compact\": \"jul\",\r\n			\"full\":\"july\"\r\n		},\r\n		\"august\": { \r\n			\"compact\": \"ago\",\r\n			\"full\":\"julio\"\r\n		},\r\n		\"september\": { \r\n			\"compact\": \"sep\",\r\n			\"full\":\"septembre\"\r\n		},\r\n		\"october\": { \r\n			\"compact\": \"oct\",\r\n			\"full\":\"octubre\"\r\n		},\r\n		\"november\": { \r\n			\"compact\": \"nov\",\r\n			\"full\":\"noviembre\"\r\n		},\r\n		\"december\": { \r\n			\"compact\": \"dic\",\r\n			\"full\":\"diciembre\"\r\n		}\r\n	}\r\n}";
      }
      public String getName() {
        return "AppText_Es_json";
      }
    }
    ;
  }
  private static class AppText_Es_jsonInitializer {
    static {
      _instance0.AppText_Es_jsonInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return AppText_Es_json;
    }
  }
  public com.google.gwt.resources.client.TextResource AppText_Es_json() {
    return AppText_Es_jsonInitializer.get();
  }
  private void AppText_Pt_jsonInitializer() {
    AppText_Pt_json = new com.google.gwt.resources.client.TextResource() {
      // file:/E:/actor/actor-platform/actor-sdk/sdk-core/core/core-js/build/resources/main/AppText_Pt.json
      public String getText() {
        return "{\r\n	\"app\": {\r\n		\"name\": \"Actor\"\r\n	},\r\n\r\n	\"language\": {\r\n\r\n		\"code\": \"Pt\",\r\n\r\n		\"format\": {\r\n			\"time\": {\r\n				\"yesterday\":{\r\n					\"short\": \"Ontem\",\r\n					\"full\": \"Ontem\"\r\n				},\r\n				\"now\": \"Agora\",\r\n				\"minutes\": {\r\n					\"short\": \"{minutes} min\",\r\n					\"full\": \"{minutes} min\"\r\n				},\r\n				\"hours\": {\r\n					\"short\": \"{hours} hs\",\r\n					\"full\": \"{hours} hs\"\r\n				}\r\n			}\r\n		},\r\n\r\n		\"file_size\": {\r\n			\"bytes\": \"{bytes} B\",\r\n			\"kbytes\": \"{kbytes} KB\",\r\n			\"mbytes\": \"{mbytes} MB\",\r\n			\"gbytes\": \"{gbytes} GB\"\r\n		},\r\n\r\n		\"referencing\": {\r\n			\"you\": \"Você\",\r\n			\"thee\": \"Você\"\r\n		},\r\n\r\n		\"sequence\": {\r\n			\"or\": \", \",\r\n			\"and\": \" and \"\r\n		}\r\n	},\r\n\r\n	\"groups\": {\r\n		\"members\": {\r\n		  \"other\": \"{count} membros\",\r\n			\"one\": \"{count} membro\"\r\n		}\r\n	},\r\n\r\n	\"presence\": {\r\n		\"online\": \"online\",\r\n		\"offline\": \"offline\",\r\n		\"now\": \"visto agora mesmo\",\r\n		\"today\": \"visto hoje às {time}\",\r\n		\"yesterday\": \"visto ontem às {time}\",\r\n		\"at_day\": \"visto {date}\",\r\n		\"at_day_time\": \"visto {date} às {time}\",\r\n		\"members\": \"{count} online\"\r\n	},\r\n\r\n	\"typing\": {\r\n		\"simple\": \"digitando...\",\r\n		\"user\": \"{user} está digitando...\",\r\n		\"group\": {\r\n			\"sequenced\": \"{users} estão digitando...\",\r\n			\"many\": \"{count} pessoas estão digitando...\"\r\n		}\r\n	},\r\n\r\n	\"content\": {\r\n\r\n		\"unknown\": \"Conteúdo não suportado\",\r\n		\"document\": \"Documento\",\r\n		\"photo\": \"Foto\",\r\n		\"video\": \"Vídeo\",\r\n		\"audio\": \"Audio\",\r\n		\"contact\": \"Contact\",\r\n		\"location\": \"Location\",\r\n		\"sticker\": \"Sticker\",\r\n\r\n		\"service\": {\r\n			\"registered\": {\r\n				\"full\": \"{name} entrou na Rede {app_name}\",\r\n				\"compact\": \"Entrou no {app_name}\"\r\n			},\r\n			\"groups\": {\r\n				\"created\": \"{name} criou o grupo\",\r\n				\"invited\": \"{name} convidado {name_added}\",\r\n				\"joined\": \"{name} entrou no grupo\",\r\n				\"kicked\": \"{name} removido {name_kicked}\",\r\n				\"left\": \"{name} saiu do grupo\",\r\n				\"title_changed\": {\r\n					\"full\":  \"{name} alterou o nome do grupo para \\\"{title}\\\"\",\r\n					\"compact\": \"{name} alterou o nome do grupo\"\r\n				},\r\n				\"topic_changed\": {\r\n					\"full\":  \"{name} changed the group topic to \\\"{topic}\\\"\",\r\n					\"compact\": \"{name} changed the group topic\"\r\n				},\r\n				\"about_changed\": {\r\n					\"full\":  \"{name} changed the group about to \\\"{about}\\\"\",\r\n					\"compact\": \"{name} changed the group about\"\r\n				},\r\n				\"avatar_changed\": \"{name} alterou a foto do grupo\",\r\n				\"avatar_removed\": \"{name} removeu a foto do grupo\"\r\n			},\r\n			\"calls\": {\r\n				\"missed\": \"Missed call\",\r\n				\"ended\": \"Call ended\"\r\n			}\r\n		}\r\n	},\r\n\r\n	\"errors\": {\r\n		\"unknown\": \"Unknown error. Please, try again later.\",\r\n		\"internal\": \"Internal server error. Please, try again later.\",\r\n		\"phone\": {\r\n			\"empty\": \"Please, enter your phone number.\",\r\n			\"incorrect\": \"Entered phone number is invalid. Please, try again.\"\r\n		},\r\n		\"code\": {\r\n			\"empty\": \"The code is invalid. Please try again.\",\r\n			\"incorrect\": \"Entered code is incorrect. Please, try again.\",\r\n			\"expired\": \"The code has expired. Please, start authentication again.\"\r\n		},\r\n		\"groups\": {\r\n			\"already_joined\": \"You have already joined the group.\",\r\n			\"unable_to_join\": \"Unable to join the group.\"\r\n		}\r\n	},\r\n\r\n	\"months\": {\r\n		\"january\": { \r\n			\"compact\": \"jan\",\r\n			\"full\":\"janeiro\"\r\n		},\r\n		\"february\": { \r\n			\"compact\": \"fev\",\r\n			\"full\":\"fevereiro\"\r\n		},\r\n		\"march\": { \r\n			\"compact\": \"mar\",\r\n			\"full\":\"março\"\r\n		},\r\n		\"april\": { \r\n			\"compact\": \"abr\",\r\n			\"full\":\"abril\"\r\n		},\r\n		\"may\": { \r\n			\"compact\": \"mai\",\r\n			\"full\":\"maio\"\r\n		},\r\n		\"june\": { \r\n			\"compact\": \"jun\",\r\n			\"full\":\"junho\"\r\n		},\r\n		\"july\": { \r\n			\"compact\": \"jul\",\r\n			\"full\":\"julho\"\r\n		},\r\n		\"august\": { \r\n			\"compact\": \"ago\",\r\n			\"full\":\"agosto\"\r\n		},\r\n		\"september\": { \r\n			\"compact\": \"set\",\r\n			\"full\":\"setembro\"\r\n		},\r\n		\"october\": { \r\n			\"compact\": \"out\",\r\n			\"full\":\"outubro\"\r\n		},\r\n		\"november\": { \r\n			\"compact\": \"nov\",\r\n			\"full\":\"novembro\"\r\n		},\r\n		\"december\": { \r\n			\"compact\": \"dez\",\r\n			\"full\":\"dezembro\"\r\n		}\r\n	}\r\n}";
      }
      public String getName() {
        return "AppText_Pt_json";
      }
    }
    ;
  }
  private static class AppText_Pt_jsonInitializer {
    static {
      _instance0.AppText_Pt_jsonInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return AppText_Pt_json;
    }
  }
  public com.google.gwt.resources.client.TextResource AppText_Pt_json() {
    return AppText_Pt_jsonInitializer.get();
  }
  private void AppText_Ru_jsonInitializer() {
    AppText_Ru_json = new com.google.gwt.resources.client.TextResource() {
      // file:/E:/actor/actor-platform/actor-sdk/sdk-core/core/core-js/build/resources/main/AppText_Ru.json
      public String getText() {
        return "{\r\n	\"app\": {\r\n		\"name\": \"Actor\"\r\n	},\r\n\r\n	\"language\": {\r\n\r\n		\"code\": \"Ru\",\r\n\r\n		\"format\": {\r\n			\"time\": {\r\n				\"yesterday\":{\r\n					\"short\": \"Вчера\",\r\n					\"full\": \"Вчера\"\r\n				},\r\n				\"now\": \"Сейчас\",\r\n				\"minutes\": {\r\n					\"short\": \"{minutes} мин.\",\r\n					\"full\": \"{minutes} минут\"\r\n				},\r\n				\"hours\": {\r\n					\"short\": \"{hours} ч.\",\r\n					\"full\": \"{hours} часов\"\r\n				}\r\n			}\r\n		},\r\n\r\n		\"file_size\": {\r\n			\"bytes\": \"{bytes} б\",\r\n			\"kbytes\": \"{kbytes} кб\",\r\n			\"mbytes\": \"{mbytes} мб\",\r\n			\"gbytes\": \"{gbytes} гб\"\r\n		},\r\n\r\n		\"referencing\": {\r\n			\"you\": \"Вы\",\r\n			\"thee\": \"Вас\"\r\n		},\r\n\r\n		\"sequence\": {\r\n			\"or\": \", \",\r\n			\"and\": \" и \"\r\n		}\r\n	},\r\n\r\n	\"groups\": {\r\n		\"members\": {\r\n		  \"other\": \"{count} участников\",\r\n			\"one\": \"{count} участник\",\r\n			\"few\": \"{count} участника\",\r\n		  \"many\": \"{count} участников\"\r\n		}\r\n	},\r\n\r\n	\"presence\": {\r\n		\"online\": \"в сети\",\r\n		\"offline\": \"не в сети\",\r\n		\"now\": {\r\n			\"male\": \"был только что\",\r\n			\"female\": \"была только что\",\r\n		  \"other\": \"был(а) только что\"\r\n		},\r\n		\"today\": {\r\n			\"male\": \"был сегодня в {time}\",\r\n			\"female\": \"была сегодня в {time}\",\r\n		  \"other\": \"был(а) сегодня в {time}\"\r\n		},\r\n		\"yesterday\": {\r\n			\"male\": \"был вчера в {time}\",\r\n			\"female\": \"была вчера в {time}\",\r\n		  \"other\": \"был(а) вчера в {time}\"\r\n		},\r\n		\"at_day\": { \r\n			\"male\": \"был {date}\",\r\n			\"female\": \"была {date}\",\r\n		  \"other\": \"был(а) {date}\"\r\n		},\r\n		\"at_day_time\": { \r\n			\"male\": \"был {date} в {time}\",\r\n			\"female\": \"была {date} в {time}\",\r\n		  \"other\": \"был(а) {date} в {time}\"\r\n		},\r\n		\"members\": \"{count} в сети\"\r\n	},\r\n\r\n	\"typing\": {\r\n		\"simple\": \"печатает...\",\r\n		\"user\": \"{user} печатает...\",\r\n		\"group\": {\r\n			\"sequenced\": \"{users} печатают...\",\r\n		  \"one\": \"{count} печатает...\",\r\n		  \"few\": \"{count} печатают...\",\r\n		  \"many\": \"{count} печатает...\",\r\n		  \"other\": \"{count} печатает...\"\r\n		}\r\n	},\r\n\r\n	\"content\": {\r\n\r\n		\"unknown\": \"Неподдерживаемое сообщение\",\r\n		\"document\": \"Документ\",\r\n		\"photo\": \"Фото\",\r\n		\"video\": \"Видео\",\r\n		\"audio\": \"Аудио\",\r\n		\"contact\": \"Контакт\",\r\n		\"location\": \"Расположение\",\r\n		\"sticker\": \"Стикер\",\r\n\r\n		\"service\": {\r\n			\"registered\": {\r\n				\"full\": {\r\n				  \"you\": \"{name} зарегистрировались в {app_name}\",\r\n					\"male\": \"{name} зарегистрировался в {app_name}\",\r\n					\"female\": \"{name} зарегистрировалась в {app_name}\",\r\n				  \"other\": \"{name} зарегистрировался(ась) в {app_name}\"\r\n				},\r\n				\"compact\": {\r\n				  \"you\": \"Вы зарегистрироваись в {app_name}\",\r\n					\"male\": \"Зарегистрировался в {app_name}\",\r\n					\"female\": \"Зарегистрировалась в {app_name}\",\r\n				  \"other\": \"Зарегистрировался(ась) в {app_name}\"\r\n				}\r\n			},\r\n			\"groups\": {\r\n				\"created\": { \r\n					\"you\": \"{name} создали группу\",\r\n					\"male\": \"{name} создал группу\",\r\n					\"female\": \"{name} создала группу\",\r\n				  \"other\": \"{name} создал(-а) группу\"\r\n				},\r\n				\"invited\": { \r\n					\"you\": \"{name} пригласили {name_added}\",\r\n					\"male\": \"{name} пригласил {name_added}\",\r\n					\"female\": \"{name} пригласила {name_added}\",\r\n				  \"other\": \"{name} пригласил(-а) {name_added}\"\r\n				},\r\n				\"joined\": {\r\n					\"you\": \"{name} вошли в группу\",\r\n					\"male\": \"{name} вошел в группу\",\r\n					\"female\": \"{name} вошла в группу\",\r\n				  \"other\": \"{name} вошел(-шла) в группу\"\r\n				},\r\n				\"kicked\": { \r\n					\"you\": \"{name} исключили {name_kicked}\",\r\n					\"male\": \"{name} исключил {name_kicked}\",\r\n					\"female\": \"{name} исключила {name_kicked}\",\r\n				  \"other\": \"{name} исключил(-а) {name_kicked}\"\r\n				},\r\n				\"left\": { \r\n					\"you\": \"{name} покинули группу\",\r\n					\"male\": \"{name} покинул группу\",\r\n					\"female\": \"{name} покинула группу\",\r\n				  \"other\": \"{name} покинул(-а) группу\"\r\n				},\r\n				\"title_changed\": {\r\n					\"full\":  {\r\n						\"you\": \"{name} изменили название группы на \\\"{title}\\\"\",\r\n						\"male\": \"{name} изменил название группы на \\\"{title}\\\"\",\r\n						\"female\": \"{name} изменила название группы на \\\"{title}\\\"\",\r\n					  \"other\": \"{name} изменил(-а) название группы на \\\"{title}\\\"\"\r\n					}, \r\n					\"compact\": {\r\n						\"you\": \"{name} изменили тему группы\",\r\n						\"male\": \"{name} изменил тему группы\",\r\n						\"female\": \"{name} изменила тему группы\",\r\n					  \"other\": \"{name} изменил(-а) тему группы\"\r\n					}\r\n				},\r\n				\"topic_changed\": {\r\n					\"full\":  {\r\n						\"you\": \"{name} изменили тему группы на \\\"{title}\\\"\",\r\n						\"male\": \"{name} изменил тему группы на \\\"{title}\\\"\",\r\n						\"female\": \"{name} изменила тему группы на \\\"{title}\\\"\",\r\n					  \"other\": \"{name} изменил(-а) тему группы на \\\"{title}\\\"\"\r\n					}, \r\n					\"compact\": {\r\n						\"you\": \"{name} изменили тему группы\",\r\n						\"male\": \"{name} изменил тему группы\",\r\n						\"female\": \"{name} изменила тему группы\",\r\n					  \"other\": \"{name} изменил(-а) тему группы\"\r\n					}\r\n				},\r\n				\"about_changed\": {\r\n					\"full\":  {\r\n						\"you\": \"{name} изменили описание группы на \\\"{title}\\\"\",\r\n						\"male\": \"{name} изменил описание группы на \\\"{title}\\\"\",\r\n						\"female\": \"{name} изменила описание группы на \\\"{title}\\\"\",\r\n					  \"other\": \"{name} изменил(-а) описание группы на \\\"{title}\\\"\"\r\n					}, \r\n					\"compact\": {\r\n						\"you\": \"{name} изменили описание группы\",\r\n						\"male\": \"{name} изменил описание группы\",\r\n						\"female\": \"{name} изменила описание группы\",\r\n					  \"other\": \"{name} изменил(-а) описание группы\"\r\n					}\r\n				},\r\n				\"avatar_changed\": {\r\n						\"you\": \"{name} изменили фото группы\",\r\n						\"male\": \"{name} изменил фото группы\",\r\n						\"female\": \"{name} изменила фото группы\",\r\n				  \"other\": \"{name} изменил(-а) фото группы\"\r\n				},\r\n				\"avatar_removed\": {\r\n						\"you\": \"{name} удалили фото группы\",\r\n						\"male\": \"{name} удалил фото группы\",\r\n						\"female\": \"{name} удалила фото группы\",\r\n				  \"other\": \"{name} удалил(-а) фото группы\"\r\n				}\r\n			},\r\n			\"calls\": {\r\n				\"missed\": \"Пропущен вызов\",\r\n				\"ended\": \"Вызов завершен\"\r\n			}\r\n		}\r\n	},\r\n\r\n	\"errors\": {\r\n		\"unknown\": \"Неизвестная ошибка. Пожалуйста, попробуйте еще раз.\",\r\n		\"internal\": \"Внутренняя ошибка сервера. Пожалуйста, попробуйте ещё раз.\",\r\n		\"phone\": {\r\n			\"empty\": \"Пожалуйста, введите свой номер телефона.\",\r\n			\"incorrect\": \"Введён некорректный номер телефона. Пожалуйста, попробуйте ещё раз.\"\r\n		},\r\n		\"code\": {\r\n			\"empty\": \"Пожалуйста, введите код подтверждения.\",\r\n			\"incorrect\": \"Введён некорректный код. Пожалуйста, попробуйте ещё раз.\",\r\n			\"expired\": \"Срок действия кода истёк. Пожалуйста, авторизуйтесь заново.\"\r\n		},\r\n		\"groups\": {\r\n			\"already_joined\": \"Вы уже вступили в эту группу.\",\r\n			\"unable_to_join\": \"Невозможно присоединиться к группе.\"\r\n		}\r\n	},\r\n\r\n	\"months\": {\r\n		\"january\": { \r\n			\"compact\": \"янв\",\r\n			\"full\":\"январь\"\r\n		},\r\n		\"february\": { \r\n			\"compact\": \"фев\",\r\n			\"full\":\"февраль\"\r\n		},\r\n		\"march\": { \r\n			\"compact\": \"мар\",\r\n			\"full\":\"март\"\r\n		},\r\n		\"april\": { \r\n			\"compact\": \"апр\",\r\n			\"full\":\"апрель\"\r\n		},\r\n		\"may\": { \r\n			\"compact\": \"май\",\r\n			\"full\":\"май\"\r\n		},\r\n		\"june\": { \r\n			\"compact\": \"июн\",\r\n			\"full\":\"июнь\"\r\n		},\r\n		\"july\": { \r\n			\"compact\": \"июл\",\r\n			\"full\":\"июль\"\r\n		},\r\n		\"august\": { \r\n			\"compact\": \"авг\",\r\n			\"full\":\"август\"\r\n		},\r\n		\"september\": { \r\n			\"compact\": \"сен\",\r\n			\"full\":\"сентябрь\"\r\n		},\r\n		\"october\": { \r\n			\"compact\": \"окт\",\r\n			\"full\":\"октябрь\"\r\n		},\r\n		\"november\": { \r\n			\"compact\": \"ноя\",\r\n			\"full\":\"ноябрь\"\r\n		},\r\n		\"december\": { \r\n			\"compact\": \"дек\",\r\n			\"full\":\"декабрь\"\r\n		}\r\n	}\r\n}";
      }
      public String getName() {
        return "AppText_Ru_json";
      }
    }
    ;
  }
  private static class AppText_Ru_jsonInitializer {
    static {
      _instance0.AppText_Ru_jsonInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return AppText_Ru_json;
    }
  }
  public com.google.gwt.resources.client.TextResource AppText_Ru_json() {
    return AppText_Ru_jsonInitializer.get();
  }
  private void AppText_Zn_jsonInitializer() {
    AppText_Zn_json = new com.google.gwt.resources.client.TextResource() {
      // file:/E:/actor/actor-platform/actor-sdk/sdk-core/core/core-js/build/resources/main/AppText_Zn.json
      public String getText() {
        return "{\r\n	\"app\": {\r\n		\"name\": \"优聆\"\r\n	},\r\n\r\n	\"language\": {\r\n\r\n		\"code\": \"Zn\",\r\n\r\n		\"format\": {\r\n			\"time\": {\r\n				\"yesterday\": \"昨天\",\r\n				\"now\": \"现在\",\r\n				\"minutes\": {\r\n					\"short\": \"{minutes} 分\",\r\n					\"full\": \"{minutes} 分\"\r\n				},\r\n				\"hours\": {\r\n					\"short\": \"{hours} 小时\",\r\n					\"full\": \"{hours} 小时\"\r\n				}\r\n			}\r\n		},\r\n\r\n		\"file_size\": {\r\n			\"bytes\": \"{bytes} B\",\r\n			\"kbytes\": \"{kbytes} KB\",\r\n			\"mbytes\": \"{mbytes} MB\",\r\n			\"gbytes\": \"{gbytes} GB\"\r\n		},\r\n\r\n		\"referencing\": {\r\n			\"you\": \"你\",\r\n			\"thee\": \"你\"\r\n		},\r\n\r\n		\"sequence\": {\r\n			\"or\": \",\",\r\n			\"and\": \",\"\r\n		}\r\n	},\r\n\r\n	\"groups\": {\r\n		\"members\": \"{count}个成员\"\r\n	},\r\n\r\n	\"presence\": {\r\n		\"online\": \"在线\",\r\n		\"offline\": \"离线\",\r\n		\"now\": \"刚刚最后一次上线\",\r\n		\"today\": \"今天{time}最后一次上线\",\r\n		\"yesterday\": \"昨天{time}最后一次上线\",\r\n		\"at_day\": \"{date}最后一次上线\",\r\n		\"at_day_time\": \"{date} {time}最后一次上线\",\r\n		\"members\": \"{count}人在线\"\r\n	},\r\n\r\n	\"typing\": {\r\n		\"simple\": \"正在输入...\",\r\n		\"user\": \"{user}正在输入...\",\r\n		\"group\": {\r\n			\"sequenced\": \"{users}正在输入...\",\r\n			\"many\": \"{count}个人正在输入...\"\r\n		}\r\n	},\r\n\r\n	\"content\": {\r\n\r\n		\"unknown\": \"不支持的内容\",\r\n		\"document\": \"文档\",\r\n		\"photo\": \"照片\",\r\n		\"video\": \"图片\",\r\n		\"audio\": \"语音\",\r\n		\"contact\": \"通讯录\",\r\n		\"location\": \"位置\",\r\n		\"sticker\": \"贴纸\",\r\n\r\n		\"service\": {\r\n			\"registered\": {\r\n				\"full\": \"{name} 已加入 {app_name}\",\r\n				\"compact\": \"已加入 {app_name}\"\r\n			},\r\n			\"groups\": {\r\n				\"created\": \"{name}创建了这个群组\",\r\n				\"invited\": \"{name}邀请{name_added}\",\r\n				\"joined\": \"{name}加入群组\",\r\n				\"kicked\": \"{name}移出{name_kicked}\",\r\n				\"left\": \"{name}退出群组\",\r\n				\"title_changed\": {\r\n					\"full\":  \"{name}修改为名称为：\\\"{title}\\\"\",\r\n					\"compact\": \"{name}修改了群组名称\"\r\n				},\r\n				\"topic_changed\": {\r\n					\"full\":  \"{name} changed the group topic to \\\"{topic}\\\"\",\r\n					\"compact\": \"{name} changed the group topic\"\r\n				},\r\n				\"about_changed\": {\r\n					\"full\":  \"{name} changed the group about to \\\"{about}\\\"\",\r\n					\"compact\": \"{name} changed the group about\"\r\n				},\r\n				\"avatar_changed\": \"{name}修改了群组头像\",\r\n				\"avatar_removed\": \"{name}删除了群组头像\"\r\n			},\r\n			\"calls\": {\r\n				\"missed\": \"未接电话\",\r\n				\"ended\": \"拨号结束\"\r\n			}\r\n		}\r\n	},\r\n\r\n	\"errors\": {\r\n		\"unknown\": \"Unknown error. Please, try again later.\",\r\n		\"internal\": \"服务器内部错误，请稍候再试。\",\r\n		\"phone\": {\r\n			\"empty\": \"请输入你的手机号码\",\r\n			\"incorrect\": \"输入的手机号码不正确，请重新输入。\"\r\n		},\r\n		\"code\": {\r\n			\"empty\": \"请正确输入验证码。\",\r\n			\"incorrect\": \"输入的验证码不正确，请重试。\",\r\n			\"expired\": \"验证码过期，请重新验证。\"\r\n		},\r\n		\"groups\": {\r\n			\"already_joined\": \"你已经是群组成员。\",\r\n			\"unable_to_join\": \"无法加入群组\"\r\n		}\r\n	},\r\n\r\n	\"months\": {\r\n		\"january\": \"一月\",\r\n		\"february\": \"二月\",\r\n		\"march\": \"三月\",\r\n		\"april\": \"四月\",\r\n		\"may\": \"五月\",\r\n		\"june\": \"六月\",\r\n		\"july\": \"七月\",\r\n		\"august\": \"八月\",\r\n		\"september\": \"九月\",\r\n		\"october\": \"十月\",\r\n		\"november\": \"十一月\",\r\n		\"december\": \"十二月\"\r\n	}\r\n}";
      }
      public String getName() {
        return "AppText_Zn_json";
      }
    }
    ;
  }
  private static class AppText_Zn_jsonInitializer {
    static {
      _instance0.AppText_Zn_jsonInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return AppText_Zn_json;
    }
  }
  public com.google.gwt.resources.client.TextResource AppText_Zn_json() {
    return AppText_Zn_jsonInitializer.get();
  }
  private void AppText_jsonInitializer() {
    AppText_json = new com.google.gwt.resources.client.TextResource() {
      // file:/E:/actor/actor-platform/actor-sdk/sdk-core/core/core-js/build/resources/main/AppText_es.json
      public String getText() {
        return "{\r\n	\"app\": {\r\n		\"name\": \"Actor\"\r\n	},\r\n\r\n	\"language\": {\r\n		\"code\": \"Es\",\r\n\r\n		\"format\": {\r\n			\"time\": {\r\n				\"yesterday\": \"Ayer\",\r\n				\"now\": \"Ahora\",\r\n				\"minutes\": {\r\n					\"short\": \"{minutes} min\",\r\n					\"full\": \"{minutes} minutes\"\r\n				},\r\n				\"hours\": {\r\n					\"short\": \"{hours} hrs\",\r\n					\"full\": \"{hours} hours\"\r\n				}\r\n			}\r\n		},\r\n\r\n		\"file_size\": {\r\n			\"bytes\": \"{bytes} B\",\r\n			\"kbytes\": \"{kbytes} KB\",\r\n			\"mbytes\": \"{mbytes} MB\",\r\n			\"gbytes\": \"{gbytes} GB\"\r\n		},\r\n\r\n		\"referencing\": {\r\n			\"you\": \"Tu\",\r\n			\"thee\": \"Tu\"\r\n		},\r\n\r\n		\"sequence\": {\r\n			\"or\": \", \",\r\n			\"and\": \" and \"\r\n		}\r\n	},\r\n\r\n	\"groups\": {\r\n		\"members\": \"{count} miembros\"\r\n	},\r\n\r\n	\"presence\": {\r\n		\"online\": \"En línea\",\r\n		\"offline\": \"Desconectado\",\r\n		\"now\": \"visto segundos atrás\",\r\n		\"today\": \"últ. vez {time}\",\r\n		\"yesterday\": \"últ. vez ayer {time}\",\r\n		\"at_day\": \"ult. vez el {date}\",\r\n		\"at_day_time\": \"ult. vez el {date} a las {time}\",\r\n		\"members\": \"{count} en línea\"\r\n	},\r\n\r\n	\"typing\": {\r\n		\"simple\": \"escribiendo...\",\r\n		\"user\": \"{user} está escribiendo...\",\r\n		\"group\": {\r\n			\"sequenced\": \"{users} estan escribiendo...\",\r\n			\"many\": \"{count} personas estan escribiendo...\"\r\n		}\r\n	},\r\n\r\n	\"content\": {\r\n\r\n		\"unknown\": \"Contenido no compatible\",\r\n		\"document\": \"Documentos\",\r\n		\"photo\": \"Foto\",\r\n		\"video\": \"Vídeo\",\r\n		\"audio\": \"Audio\",\r\n		\"contact\": \"Contacto\",\r\n		\"location\": \"Localización\",\r\n		\"sticker\": \"Sticker\",\r\n\r\n		\"service\": {\r\n			\"registered\": {\r\n				\"full\": \"{name} unido a la red {app_name}\",\r\n				\"compact\": \"Entro en {app_name}\"\r\n			},\r\n			\"groups\": {\r\n				\"created\": \"{name} сreado el grupo\",\r\n				\"invited\": \"{name} invitó a {name_added}\",\r\n				\"joined\": \"{name} se unió al grupo\",\r\n				\"kicked\": \"{name} expulsaste a {name_kicked}\",\r\n				\"left\": \"{name} elimino el grupo\",\r\n				\"title_changed\": {\r\n					\"full\":  \"{name} cambio el nombre del grupo a \\\"{title}\\\"\",\r\n					\"compact\": \"{name} a modificado el nombre del grupo\"\r\n				},\r\n				\"topic_changed\": {\r\n					\"full\":  \"{name} changed the group topic to \\\"{topic}\\\"\",\r\n					\"compact\": \"{name} changed the group topic\"\r\n				},\r\n				\"about_changed\": {\r\n					\"full\":  \"{name} changed the group about to \\\"{about}\\\"\",\r\n					\"compact\": \"{name} changed the group about\"\r\n				},\r\n				\"avatar_changed\": \"{name} modificada la foto de grupo\",\r\n				\"avatar_removed\": \"{name} eliminada la foto de grupo\"\r\n			},\r\n			\"calls\": {\r\n				\"missed\": \"Llamada perdida\",\r\n				\"ended\": \"Llamada finalizada\"\r\n			}\r\n		}\r\n	},\r\n\r\n	\"errors\": {\r\n		\"unknown\": \"Unknown error. Please, try again later.\",\r\n		\"internal\": \"Error Interno del Servidor. Por favor, inténtelo de nuevo más tarde.\",\r\n		\"phone\": {\r\n			\"empty\": \"Por favor, introduce tu número de teléfono.\",\r\n			\"incorrect\": \"Número de teléfono introducido no es válido. Por favor, vuelve a intentarlo.\"\r\n		},\r\n		\"code\": {\r\n			\"empty\": \"Código no válido. Por favor, vuelve a intentarlo.\",\r\n			\"incorrect\": \"El código introducido es incorrecta. Por favor, vuelve a intentarlo.\",\r\n			\"expired\": \"Código expirado. Por favor, inicia la autenticación de nuevo.\"\r\n		},\r\n		\"groups\": {\r\n			\"already_joined\": \"Ya eres miembro del grupo.\",\r\n			\"unable_to_join\": \"No puede unirse al grupo.\"\r\n		}\r\n	},\r\n\r\n	\"months\": {\r\n		\"january\": { \r\n			\"compact\": \"ene\",\r\n			\"full\":\"enero\"\r\n		},\r\n		\"february\": { \r\n			\"compact\": \"feb\",\r\n			\"full\":\"febrero\"\r\n		},\r\n		\"march\": { \r\n			\"compact\": \"mar\",\r\n			\"full\":\"marzo\"\r\n		},\r\n		\"april\": { \r\n			\"compact\": \"apr\",\r\n			\"full\":\"abril\"\r\n		},\r\n		\"may\": { \r\n			\"compact\": \"may\",\r\n			\"full\":\"mayo\"\r\n		},\r\n		\"june\": { \r\n			\"compact\": \"jun\",\r\n			\"full\":\"junio\"\r\n		},\r\n		\"july\": { \r\n			\"compact\": \"jul\",\r\n			\"full\":\"july\"\r\n		},\r\n		\"august\": { \r\n			\"compact\": \"ago\",\r\n			\"full\":\"julio\"\r\n		},\r\n		\"september\": { \r\n			\"compact\": \"sep\",\r\n			\"full\":\"septembre\"\r\n		},\r\n		\"october\": { \r\n			\"compact\": \"oct\",\r\n			\"full\":\"octubre\"\r\n		},\r\n		\"november\": { \r\n			\"compact\": \"nov\",\r\n			\"full\":\"noviembre\"\r\n		},\r\n		\"december\": { \r\n			\"compact\": \"dic\",\r\n			\"full\":\"diciembre\"\r\n		}\r\n	}\r\n}";
      }
      public String getName() {
        return "AppText_json";
      }
    }
    ;
  }
  private static class AppText_jsonInitializer {
    static {
      _instance0.AppText_jsonInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return AppText_json;
    }
  }
  public com.google.gwt.resources.client.TextResource AppText_json() {
    return AppText_jsonInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource AppText_Ar_json;
  private static com.google.gwt.resources.client.TextResource AppText_Es_json;
  private static com.google.gwt.resources.client.TextResource AppText_Pt_json;
  private static com.google.gwt.resources.client.TextResource AppText_Ru_json;
  private static com.google.gwt.resources.client.TextResource AppText_Zn_json;
  private static com.google.gwt.resources.client.TextResource AppText_json;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      AppText_Ar_json(), 
      AppText_Es_json(), 
      AppText_Pt_json(), 
      AppText_Ru_json(), 
      AppText_Zn_json(), 
      AppText_json(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("AppText_Ar_json", AppText_Ar_json());
        resourceMap.put("AppText_Es_json", AppText_Es_json());
        resourceMap.put("AppText_Pt_json", AppText_Pt_json());
        resourceMap.put("AppText_Ru_json", AppText_Ru_json());
        resourceMap.put("AppText_Zn_json", AppText_Zn_json());
        resourceMap.put("AppText_json", AppText_json());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'AppText_Ar_json': return this.@im.actor.core.js.providers.Assets::AppText_Ar_json()();
      case 'AppText_Es_json': return this.@im.actor.core.js.providers.Assets::AppText_Es_json()();
      case 'AppText_Pt_json': return this.@im.actor.core.js.providers.Assets::AppText_Pt_json()();
      case 'AppText_Ru_json': return this.@im.actor.core.js.providers.Assets::AppText_Ru_json()();
      case 'AppText_Zn_json': return this.@im.actor.core.js.providers.Assets::AppText_Zn_json()();
      case 'AppText_json': return this.@im.actor.core.js.providers.Assets::AppText_json()();
    }
    return null;
  }-*/;
}
