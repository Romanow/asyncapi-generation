import _ from 'lodash';

const currentTime = () => {
    return (new Date(Date.now())).toISOString();
}
const toClassName = (input) => {
    return _.lowerFirst(_.camelCase(input));
}

const toKotlinClass = (prop) => {
    const typeMap = {
        string: 'String',
        integer: 'Int',
        number: 'Double',
        boolean: 'Boolean',
        object: 'Any'
    };

    if (prop.type() === 'array') {
        const items = prop.items();
        return `List<${module.exports(items)}>`;
    }

    if (prop.format() === 'date-time') {
        return 'java.time.LocalDateTime';
    }

    return typeMap[prop.type()] || 'Any';
}

export {currentTime, toKotlinClass, toClassName}
