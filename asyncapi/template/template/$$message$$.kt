{%- include "include/note.kt" -%}
package {{ params.packageName }}.model;

import javax.annotation.processing.Generated;

{% for schemaName, schema in asyncapi.components().schemas() -%}
@Generated(value = "AsyncAPI Generator", date="{{''|currentTime }}")
data class {{ schemaName | toClassName }}(
    {% for propName, prop in schema.properties() -%}
    val {{ propName }}: {{ prop | toKotlinClass }}{% if not loop.last %},{% endif %}
    {%- endfor %}
)
{% endfor -%}
